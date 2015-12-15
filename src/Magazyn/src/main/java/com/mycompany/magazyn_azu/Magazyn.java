/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.magazyn_azu;

import com.nyga.azu.asortyment.Asortyment_Service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceRef;
import org.w3c.dom.events.EventException;
import com.nyga.azu.asortyment.Produkt;

/**
 *
 * @author Lukasz
 */
@WebService(serviceName = "Magazyn")
public class Magazyn {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Asortyment/asortyment.wsdl")
    private Asortyment_Service service;

    // @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Asortyment/asortyment.wsdl")
    // private com.nyga.azu.asortyment.Asortyment_Service service;
    // List<Produkt> sprzedaz;
    private List<ProduktMg> sprzedaz;
    // private List<Produkt> sprzedaz;
    private List<Produkt> naprawa;
    Logger log;

    public List<ProduktMg> getSprzedaz() {
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
        //sprzedaz.add(new Produkt(1, "przedmiot1", "opis_przedmiot1", BigDecimal.valueOf(19.99)));
        //   sprzedaz.add(new Produkt(2, "przedmiot2", "opis_przedmiot2", BigDecimal.valueOf(19.99)));
        // sprzedaz.add(new Produkt(3, "przedmiot3", "opis_przedmiot3", BigDecimal.valueOf(19.99)));
        //sprzedaz.add(new Produkt(4, "przedmiot4", "opis_przedmiot4", BigDecimal.valueOf(19.99)));
        //sprzedaz.add(new Produkt(4, "przedmiot5", "opis_przedmiot5", BigDecimal.valueOf(19.99)));
    }

    @Oneway
    @WebMethod(operationName = "dodajDoMagazynu")
    public void dodajDoMagazynu(@WebParam(name = "kod_prod") int kod) {

        try { // Call Web Service Operation
            com.nyga.azu.asortyment.Asortyment port = service.getAsortymentPort();
            // TODO process result here
            java.util.List<com.nyga.azu.asortyment.Produkt> result = port.pobierzListe();
            //  System.out.println("Result = "+result);
            int i = 0;
            boolean existAso = false;
            boolean existMg = false;

            for (Produkt x : result) {
                if (x.getKodProduktu() == kod) {
                    existAso = true;
                }
            }

            for (ProduktMg y : sprzedaz) {
                if (y.getKodProduktu() == kod) {
                    existMg = true;
                }
            }
            if (existAso == false && existMg == false) {
                sprzedaz.add(new ProduktMg(kod, 1));
            }

            //   sprzedaz = new ArrayList<>(result);
            System.out.println("Result sprzedaz = " + sprzedaz);

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }

    @WebMethod(operationName = "pobierz")
    public int pobierz(@WebParam(name = "kod") int kod) {
     long ilosc=0;
       
                for (ProduktMg y : sprzedaz) {
                    if (y.getKodProduktu() == kod) {
                        y.setIlosc(y.getIlosc() -1);
                       ilosc = y.getIlosc();
                    }
                }
  
            System.out.println("Result sprzedaz = " + sprzedaz);

      
        
        
       return (int)ilosc; 
    }

    @WebMethod(operationName = "uzupelnij")
    public void uzupelnij() {

        try { // Call Web Service Operation
            com.nyga.azu.asortyment.Asortyment port = service.getAsortymentPort();
            // TODO process result here
            java.util.List<com.nyga.azu.asortyment.Produkt> result = port.pobierzListe();
            //  System.out.println("Result = "+result);
            int i = 0;
            int ilosc;
            for (Produkt x : result) {
                i++;
                for (ProduktMg y : sprzedaz) {
                    if (x.getKodProduktu() == y.getKodProduktu()) {
                        sprzedaz.get(i).setIlosc(y.getIlosc() + 1);
                    }
                }
            }

            //   sprzedaz = new ArrayList<>(result);
            System.out.println("Result sprzedaz = " + sprzedaz);

        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        // log.info(new Date().toString());
    }

    @WebMethod(operationName = "wyswietlStan")
    public int wyswietlStan(@WebParam(name = "kod") int kod) throws EventException {
        int ilosc = 0;
        for (ProduktMg x : sprzedaz) {
            if (x.getKodProduktu() == kod) {
                ilosc++;
            }
        }
        return ilosc;
    }
}
