package com.nyga.azu.asortyment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;

@WebService(serviceName = "asortyment")
public class Asortyment {

    @WebServiceRef(wsdlLocation = "wsdl/localhost_8080/Magazyn/Magazyn.wsdl")
    private Magazyn_Service service;

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
    public void usunProdukt(@WebParam(name = "kodProduktu") int kodProduktu) {
        //przykladowan alista
        List<Produkt> listaProduktow = new ArrayList();
        listaProduktow.add(new Produkt(12345, "mlotek", "bardzo dobry mlotek", BigDecimal.valueOf(19.99)));
        listaProduktow.add(new Produkt(12346, "deska", "bardzo dobra deska", BigDecimal.valueOf(39.99)));
        listaProduktow.add(new Produkt(12346, "gwozdz", "bardzo dobry gwozdz", BigDecimal.valueOf(0.16)));

        int isProdExist = 1;
        try {
            Magazyn port = service.getMagazynPort();
            isProdExist = port.wyswietlStan(kodProduktu);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            System.out.println(ex);
        }

        //jesli nie ma w magazynie to mozna usunac z asortymentu
        if (isProdExist == 0) {
            for (int i = 0; i < listaProduktow.size(); i++) {
                if (listaProduktow.get(i).getKodProduktu() == kodProduktu) {
                    listaProduktow.remove(i);
                }
            }
        }
//        System.out.println("check this out " + listaProduktow.get(0));
    }

    @WebMethod(operationName = "pobierzListe")
    public List<Produkt> pobierzListe(@WebParam(name = "kodProduktu") long kodProduktu,
            @WebParam(name = "nazwa") String nazwa,
            @WebParam(name = "opis") String opis,
            @WebParam(name = "cena") BigDecimal cena) {
        
        System.out.println("pobieranie listy");

        //todo
        List listaProduktow = new ArrayList();
        return listaProduktow;
    }
}
