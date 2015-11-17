/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author Konrad Żabicki, Jakub Woźniak
 */
@WebService(serviceName = "Klienci")
public class Klienci {

    /**
     * Metoda, ktora dodaje klienta
     *
     * @param imie
     * @param nazwisko
     * @param adres
     * @param NIP
     * @param PESEL
     * @param nrTel
     * @return 
     */
    @WebMethod(operationName = "dodaj_klienta")
    public String dodajKlienta(String imie, String nazwisko, 
                String adres, int NIP, int nrTel, int PESEL) {
        int ID_klienta = PESEL;
        return "ID nowego klienta: " + ID_klienta;
    }
    
     /**
     * Metoda, ktora usuwa klienta
     *
     * @param ID_klienta
     */ 
    @Oneway
    @WebMethod(operationName = "usun_klienta")
    public void Usun(String ID_klienta) {
    }
     
    /**
     * Metoda, ktora edytuje klienta
     *
     * @param imie
     * @param nazwisko
     * @param adres
     * @param nrTel
     */
    @Oneway
    @WebMethod(operationName = "edytuj_klienta")
    public void Edytuj(String imie, String nazwisko, 
                String adres, int nrTel) {
    }   
    
    /**
     * Metoda dodajaca zakup do historii zakopow
     *
     */
    @Oneway
    @WebMethod(operationName = "dodaj_do_historii_zakupow")
    public void /*List<ListaPlac>*/ dodajDoHistorii() {
        //List<ListaPlac> lista = new ArrayList<>();
      //  return lista;
    }
    
    /**
     * Metoda obliczajaca rabat dla danego klienta
     *
     * @return 
     */
    @WebMethod(operationName = "oblicz_rabat")
    public int /*List<ListaPlac>*/ obliczRabat() {
        int rabat = 0;
        //List<ListaPlac> lista = new ArrayList<>();
        return rabat;
    }
}