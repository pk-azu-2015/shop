package com.nyga.azu.asortyment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "asortyment")
public class Asortyment {

    @Oneway
    @WebMethod(operationName = "dodajProdukt")
    public void dodajProdukt(@WebParam(name = "kodProduktu") long kodProduktu,
            @WebParam(name = "nazwa") String nazwa,
            @WebParam(name = "opis") String opis,
            @WebParam(name = "cena") BigDecimal cena) {
        //todo
    }

    @Oneway
    @WebMethod(operationName = "usunProdukt")
    public void usunProdukt(@WebParam(name = "kodProduktu") long kodProduktu) {

        //todo
    }

    @WebMethod(operationName = "pobierzListe")
    public List<Produkt> pobierzListe(@WebParam(name = "kodProduktu") long kodProduktu,
            @WebParam(name = "nazwa") String nazwa,
            @WebParam(name = "opis") String opis,
            @WebParam(name = "cena") BigDecimal cena) {

        //todo
        List listaProduktow = new ArrayList();
        return listaProduktow;
    }
}
