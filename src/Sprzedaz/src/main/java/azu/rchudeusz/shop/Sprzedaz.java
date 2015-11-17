package azu.rchudeusz.shop;

import java.util.ArrayList;
import static java.util.Collections.list;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rchudeusz,jwislak
 */
@WebService(serviceName = "Sprzedaz")
public class Sprzedaz {

    //List<Pair<String, Integer>> list;
    private String getRandomHexString(int numchars){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while(sb.length() < numchars){
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0, numchars);
    }
    
    @WebMethod(operationName = "sprzedaj")
    public WyjscieS sprzedaj(@WebParam(name = "id_klienta") String id_klienta, @WebParam(name = "list") List<Item2> list) {

        //do implementacji
        //WyjscieS sp1 = new WyjscieS(1.0,new List<Item>);
        //WyjscieS sp1 = new WyjscieS(4.5, new List<Item>());
        List<Item> listTmp= new ArrayList<Item>();
        for (int i=0; i<list.size(); i++) {
            listTmp.add(new Item(this.getRandomHexString(15),list.get(i).getKod_produktu()));
        }
        //zamiast pobierania ceny i ilosci towaru losujemy wartosc zakupow
        double cena = new Random().nextDouble();
        WyjscieS sp1 = new WyjscieS(cena, listTmp);

        return sp1;
    }

    @WebMethod(operationName = "naprawa_gwarancyjna")
    public WyjscieN naprawa_gwarancyjna(@WebParam(name = "kod_sprzedazy") String kod_sprzedazy, @WebParam(name = "kod_produktu") String kod_produktu) {

        
        //do implementacji
        WyjscieN sn1 = new WyjscieN(true, false);

        return sn1;
    }

    @WebMethod(operationName = "zwroty")
    public Boolean zwroty(@WebParam(name = "kod_sprzedazy") String kod_sprzedazy, @WebParam(name = "kod_produktu") String kod_produktu) {
        Random a = new Random();
        return a.nextBoolean();
    }

}
