package azu.rchudeusz.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;
import java.util.Random;
import javax.xml.ws.WebServiceRef;
import test.ksiegowosc.Ksiegowosc_Service;

/**
 *
 * @author rchudeusz, jwislak
 */

@WebService(serviceName = "Sprzedaz")
public class Sprzedaz {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Ksiegowosc/Ksiegowosc.wsdl")
    private Ksiegowosc_Service service;
    
    private long lastId=0;

    public long getLastId() {
        lastId++;
        return lastId;
    }
    
    //@WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Ksiegowosc/Ksiegowosc.wsdl")
    //private test.ksiegowosc.Ksiegowosc_Service service;
    
    @WebMethod(operationName = "sprzedaj")
    public WyjscieS sprzedaj(@WebParam(name = "list") List<Item2> list, @WebParam(name = "id_klienta") long id_klienta) {

   
        List<Item> listTmp= new ArrayList<Item>();
        for (int i=0; i<list.size(); i++) {
            listTmp.add(new Item(list.get(i).getKod_produktu(),
            BigDecimal.valueOf(new Random().nextDouble()*list.get(1).getIlosc())));// czy ma pobierac cene???????==============
        }
        //losowanie kodu sprzedaży
      //  long kodSprzedazy = new Random().nextLong();
        //trzeba sprzawdzic metoda Pobierz informacje o zakupie czy id juz nie jest w bazie
        
        
        //pobranie kodu sprzedaży
        long kodSprzedazy = this.getLastId();
        
        WyjscieS sp1 = new WyjscieS(listTmp, kodSprzedazy);

        //wywolanie metody Dodaj sprzedaż z Ksiegowości        
        
        try {
            test.ksiegowosc.Ksiegowosc port = service.getKsiegowoscPort();
            test.ksiegowosc.Produkt tmp;
            tmp=new test.ksiegowosc.Produkt();
            java.util.List<test.ksiegowosc.Produkt> produkt = new java.util.LinkedList<test.ksiegowosc.Produkt>();
            for (int i=0; i<listTmp.size(); i++) {
                tmp.setKodProduktu((int) listTmp.get(i).getKod_produktu()); //wyrzucic rzutowanie jak poprawi Ksiegowosc
                tmp.setCena(listTmp.get(i).getCena().intValue());  //wyrzucic intValue jak poprawi Ksiegowosc
                produkt.add(tmp);
            }
            //long kodSprzedazy = 0;
            port.dodajSprzedaz(produkt, (int)kodSprzedazy);//blad rzutowania niepoprawny typ w ksiegowosci **poprawic na long!!
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }


        //wywołanie metody Dodaj do historii zakupów z Klienci
        //Brak implementacji ze strony modułu Klienci
        

        return sp1;
    }

    @WebMethod(operationName = "naprawa_gwarancyjna")
    public WyjscieN naprawa_gwarancyjna(@WebParam(name = "kod_sprzedazy") long kod_sprzedazy,
            @WebParam(name = "kod_produktu") long kod_produktu) {

        //przy uzyciu Pobierz informacje o zakupie sprawdzic czy podany kod_produktu był faktycznie sprzedany
        try { // Call Web Service Operation
            test.ksiegowosc.Ksiegowosc port = service.getKsiegowoscPort();
            // TODO initialize WS operation arguments here
            int idSprzedazy = 0;
            // TODO process result here
            java.util.List<test.ksiegowosc.Produkt> result = port.pobierzInfoOSprzedazy(idSprzedazy);
            System.out.println("Kod sprzedazy istnieje, zakupiono nastepujace produkty"+result);
            //jezeli byl zakup to naprawa
            WyjscieN sn1 = new WyjscieN(true, new Random().nextBoolean());
            return sn1;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            //kod sprzedazy nie istnieje nie ma naprawy
            WyjscieN sn1 = new WyjscieN(false,false);
            return sn1;
        }

    }

    @WebMethod(operationName = "zwroty")
    public Boolean zwroty(@WebParam(name = "kod_sprzedazy") long kod_sprzedazy, 
            @WebParam(name = "kod_produktu") long kod_produktu) {
        //przy uzyciu Pobierz informacje o zakupie sprawdzic czy podany kod_produktu był faktycznie sprzedany
        
        try { // Call Web Service Operation
            test.ksiegowosc.Ksiegowosc port = service.getKsiegowoscPort();
            // TODO initialize WS operation arguments here
            int idSprzedazy = 0;
            // TODO process result here
            java.util.List<test.ksiegowosc.Produkt> result = port.pobierzInfoOSprzedazy(idSprzedazy);
            System.out.println("Kod sprzedazy istnieje, zakupiono nastepujace produkty"+result);
            return true;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            //kod sprzedazy nie istnieje nie ma zwrotu
            return false;
        }
    }

}
