/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.magazyn_azu;

import java.util.Date;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lukasz
 */
@WebService(serviceName = "Magazyn")
public class Magazyn {
Logger log;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @Oneway
   @WebMethod(operationName = "dodajDoMagazynu")
    public void dodajDoMagazynu(@WebParam(name = "kod_prod") int txt) {
        
    }
     @WebMethod(operationName = "pobierz")
    public int pobierz(@WebParam(name = "name") int txt) {
        return txt;
    }
     @WebMethod(operationName = "uzupelnij")
    public void uzupelnij() {     
       log.info(new Date().toString());
    }
     @WebMethod(operationName = "wyswietlStan")
    public int wyswietlStan() {
        int txt=0;
        return txt;
    }
}
