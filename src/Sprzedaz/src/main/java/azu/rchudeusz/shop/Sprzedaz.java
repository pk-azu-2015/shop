package azu.rchudeusz.shop;

import static java.util.Collections.list;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rchudeusz
 */
@WebService(serviceName = "Sprzedaz")
public class Sprzedaz {

    //List<Pair<String, Integer>> list;

    @WebMethod(operationName = "sprzedaj")
    public WyjscieS sprzedaj(@WebParam(name = "id_klienta") String id_klienta, @WebParam(name = "list") List<Item2> list) {

        //do implementacji
        //WyjscieS sp1 = new WyjscieS(1.0,new List<Item>);
        //WyjscieS sp1 = new WyjscieS(4.5, new List<Item>());
        WyjscieS sp1 = new WyjscieS();

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
