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
    
    private List<Produkt> listaProduktow = new ArrayList();

    private void init() {
        listaProduktow.add(new Produkt(12345, "mlotek", "bardzo dobry mlotek", BigDecimal.valueOf(19.99)));
        listaProduktow.add(new Produkt(12346, "deska", "bardzo dobra deska", BigDecimal.valueOf(39.99)));
        listaProduktow.add(new Produkt(12347, "gwozdz", "bardzo dobry gwozdz", BigDecimal.valueOf(0.16)));
    }

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Magazyn/Magazyn.wsdl")
    private Magazyn_Service service;

    @Oneway
    @WebMethod(operationName = "dodajProdukt")
    public void dodajProdukt(@WebParam(name = "kodProduktu") long kodProduktu,
            @WebParam(name = "nazwa") String nazwa,
            @WebParam(name = "opis") String opis,
            @WebParam(name = "cena") BigDecimal cena) {

        if (listaProduktow.isEmpty()) {
            init();
        }
        
        listaProduktow.add(new Produkt(kodProduktu, null, null, null));
    }

    @Oneway
    @WebMethod(operationName = "usunProdukt")
    public void usunProdukt(@WebParam(name = "kodProduktu") int kodProduktu) {

        if (listaProduktow.isEmpty()) {
            init();
        }

        int isProdExist = 1;
        try {
            Magazyn port = service.getMagazynPort();
            isProdExist = port.wyswietlStan(kodProduktu);
        } catch (Exception ex) {
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
    }

    @WebMethod(operationName = "pobierzListe")
    public List<Produkt> pobierzListe(@WebParam(name = "kodProduktu") long kodProduktu,
            @WebParam(name = "nazwa") String nazwa,
            @WebParam(name = "opis") String opis,
            @WebParam(name = "cena") BigDecimal cena) {

        if (listaProduktow.isEmpty()) {
            init();
        }

        return listaProduktow;
    }
}
