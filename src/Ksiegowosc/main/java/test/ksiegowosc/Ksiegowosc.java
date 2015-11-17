package azu.maven.ksiegowosc;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author student
 */
@WebService(serviceName = "Ksiegowosc")
public class Ksiegowosc {

    //TODO: pobrac inne pliki wsdl, zaimportowac je (prawy -> new -> web service cliennt ...
    //bedziemy mogli z nich korzystac -> dzieki temu dostaniemy liste produktow i liste plac
    /**
     * Funkcja dodajaca nowa sprzedaz do ksiegowosci
     *
     * @param kodSprzedazy
     */
    @WebMethod(operationName = "dodaj_sprzedaz")
    public void dodajSprzedaz(/*@WebParam(name = "produkt") List<Produkt> produkt,*/@WebParam(name = "kodSprzedazy") int kodSprzedazy) {
        //zamiast List<Produkt> produkt, moze List<Pair<Integer, Double>> produkt ??
        System.out.println("Ok - dodaj_sprzedaz");
    }

    /**
     * Funkcja dodajaca nowy zakup do ksiegowosci
     *
     * @param kodZakupu
     */
    @WebMethod(operationName = "dodaj_zakup")
    public void dodajZakup(/*@WebParam(name = "produkt") List<Produkt> produkt,*/@WebParam(name = "kodZakupu") int kodZakupu) {
        //zamiast List<Produkt> produkt, moze List<Pair<Integer, Double>> produkt ??
        System.out.println("Ok - dodaj_zakup");
    }

    /**
     * Funkcja odpowiedzialna za dokonanie wyplat dla pracownikow
     */
    @WebMethod(operationName = "wyplaty")
    public void wyplaty(/*@WebParam(name = "listaPlac") List<ListaPlac> listaPlac*/) {
        System.out.println("Ok - wyplaty");
    }

    /**
     * Funkcja odpowiedzialna za pobieranie aktualnego stanu konta sklepu (??)
     * Dlaczego na wyjscie Lista Plac (??)
     *
     * @return
     */
    @WebMethod(operationName = "pobierz_stan_konta")
    public List<Integer> /*List<ListaPlac> */ pobierzStanKonta() {
        //List<ListaPlac> tmp = new ArrayList<>();
        //klient ktory bedzie pobieral z 
        List<Integer> tmp = new ArrayList<>();
        return tmp;
    }

    /**
     * Funkcja odpowiedzialna za sprawdzenie wybranego paragonu/faktury
     * zakupu/sprzedazy
     *
     * @param idSprzedazy
     * @return
     */
    @WebMethod(operationName = "pobierz_info_o_zakupie")
    public List<Integer>/*List<Produkt>*/ pobierzInfoZakup(@WebParam(name = "idSprzedazy") int idSprzedazy) {
        //List<Produkt> tmp = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        if (/*!tmp.find(idSprzedazy)*/false) {
            return null;
        } else {
            return tmp;
        }
    }
}
