package azu.rchudeusz.shop;

import static java.util.Collections.list;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

/**
 *
 * @author rchudeusz
 */

@WebService(serviceName = "Sprzedaz")
public class Sprzedaz {

List<Pair<String, Integer>> list;
    @WebMethod(operationName = "sprzedaj")
    public String sprzedaj(@WebParam(name = "id_klienta") String id_klienta, @WebParam(name = "list") List<Pair<String, Integer>> list) {
        return "Hello " + id_klienta + " !";
    }

    @WebMethod(operationName = "naprawa_gwarancyjna")
    public String naprawa_gwarancyjna(@WebParam(name = "kod_sprzedazy") String kod_sprzedazy, @WebParam(name = "kod_produktu")String kod_produktu) {
        //return "Hello " + txt + " !";
       return "ss";
    }
  
    @WebMethod(operationName = "zwroty")
    public Boolean zwroty(@WebParam(name = "kod_sprzedazy") String kod_sprzedazy, @WebParam(name = "kod_produktu")String kod_produktu) {
        //return "Hello " + txt + " !";
        return true;
    }

}