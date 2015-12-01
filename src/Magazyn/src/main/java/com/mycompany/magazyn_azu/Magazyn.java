/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.magazyn_azu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.w3c.dom.events.EventException;

/**
 *
 * @author Lukasz
 */
@WebService(serviceName = "Magazyn")
public class Magazyn {

    private List<Produkt> sprzedaz;
    private List<Produkt> naprawa;
    Logger log;

    public List<Produkt> getSprzedaz() {
        return sprzedaz;
    }

    public List<Produkt> getNaprawa() {
        return naprawa;
    }

    public Magazyn() {
        sprzedaz = new ArrayList<>();
        naprawa = new ArrayList<>();
        inicjuj();
    }

    private void inicjuj() {
        sprzedaz.add(new Produkt(1, "przedmiot1", "opis_przedmiot1", BigDecimal.valueOf(19.99)));
        sprzedaz.add(new Produkt(2, "przedmiot2", "opis_przedmiot2", BigDecimal.valueOf(19.99)));
        sprzedaz.add(new Produkt(3, "przedmiot3", "opis_przedmiot3", BigDecimal.valueOf(19.99)));
        sprzedaz.add(new Produkt(4, "przedmiot4", "opis_przedmiot4", BigDecimal.valueOf(19.99)));
        sprzedaz.add(new Produkt(4, "przedmiot5", "opis_przedmiot5", BigDecimal.valueOf(19.99)));
    }

    @Oneway
    @WebMethod(operationName = "dodajDoMagazynu")
    public void dodajDoMagazynu(@WebParam(name = "kod_prod") int kod) {
        
    }

    @WebMethod(operationName = "pobierz")
    public int pobierz(@WebParam(name = "name") int kod) {
        return kod;
    }

    @WebMethod(operationName = "uzupelnij")
    public void uzupelnij() {
        log.info(new Date().toString());
    }

    @WebMethod(operationName = "wyswietlStan")
    public int wyswietlStan(@WebParam(name = "kod") int kod) throws EventException {
        int ilosc = 0;
        for(Produkt x: sprzedaz){
            if(x.getKodProduktu() == kod){
                ilosc++;
            }
        }
        return ilosc;
    }
}
