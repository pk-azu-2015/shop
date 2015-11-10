package com.nyga.azu.asortyment;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "asortyment")
public class Asortyment {

    @WebMethod(operationName = "dodajProdukt")
    public String dodajProdukt(@WebParam(name = "name") String txt) {

        //todo
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "usunProdukt")
    public String usunProdukt(@WebParam(name = "name") String txt) {

        //todo
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "pobierzListe")
    public String pobierzListe(@WebParam(name = "name") String txt) {

        //todo
        return "Hello " + txt + " !";
    }
}
