package azu.rchudeusz.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rchudeusz, jwislak
 */

@WebService(serviceName = "Sprzedaz")
public class Sprzedaz {

    //List<Pair<String, Integer>> list;
    
    @WebMethod(operationName = "sprzedaj")
    public WyjscieS sprzedaj(@WebParam(name = "list") List<Item2> list, @WebParam(name = "id_klienta") long id_klienta) {

        //do implementacji
        //WyjscieS sp1 = new WyjscieS(1.0,new List<Item>);
        //WyjscieS sp1 = new WyjscieS(4.5, new List<Item>());
        List<Item> listTmp= new ArrayList<Item>();
        for (int i=0; i<list.size(); i++) {
            listTmp.add(new Item(list.get(i).getKod_produktu(),
            BigDecimal.valueOf(new Random().nextDouble()*list.get(1).getIlosc())));
        }
        //losowanie kodu sprzedaży
        long kodSprzedazy = new Random().nextLong();
        //trzeba sprzawdzic metoda Pobierz informacje o zakupie czy id juz nie jest w bazie
        
        WyjscieS sp1 = new WyjscieS(listTmp, kodSprzedazy);
        //wywolanie metody Dodaj sprzedaż
        

        return sp1;
    }

    @WebMethod(operationName = "naprawa_gwarancyjna")
    public WyjscieN naprawa_gwarancyjna(@WebParam(name = "kod_sprzedazy") long kod_sprzedazy,
            @WebParam(name = "kod_produktu") long kod_produktu) {

        //przy uzyciu Pobierz informacje o zakupie sprawdzic czy podany kod_produktu był faktycznie sprzedany
        //do implementacji
        WyjscieN sn1 = new WyjscieN(new Random().nextBoolean(), new Random().nextBoolean());

        return sn1;
    }

    @WebMethod(operationName = "zwroty")
    public Boolean zwroty(@WebParam(name = "kod_sprzedazy") long kod_sprzedazy, 
            @WebParam(name = "kod_produktu") long kod_produktu) {
        //przy uzyciu Pobierz informacje o zakupie sprawdzic czy podany kod_produktu był faktycznie sprzedany
        Random a = new Random();
        return a.nextBoolean();
    }

}
