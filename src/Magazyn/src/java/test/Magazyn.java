/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lukasz
 */
@WebService(serviceName = "Magazyn")
public class Magazyn {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
   @WebMethod(operationName = "dodajDoMagazynu")
    public String dodajDoMagazynu(@WebParam(name = "kod_prod") int txt) {
        return "Pomyslnie dodano";
    }
     @WebMethod(operationName = "pobierz")
    public int pobierz(@WebParam(name = "name") int txt) {
        return txt;
    }
     @WebMethod(operationName = "uzupelnij")
    public String uzupelnij() {
        return "ZWrot do logow";
    }
     @WebMethod(operationName = "wyswietlStan")
    public int wyswietlStan() {
        int txt=0;
        return txt;
    }
}
