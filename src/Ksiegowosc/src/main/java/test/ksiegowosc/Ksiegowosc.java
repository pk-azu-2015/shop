/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ksiegowosc;

import java.sql.DriverManager;
import java.sql.SQLException;
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
    
    public void polaczenieZBaza(){
        // LADOWANIE STEROWNIKA
		System.out.print("Sprawdzanie sterownika:");
        try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			System.out.println("Blad przy ladowaniu sterownika bazy!");
			System.exit(1);
		}
		System.out.print(" sterownik OK");
		
		// LACZENIE Z BAZA
		System.out.print("\nLaczenie z baza danych:");
		String baza = "jdbc:mysql://olimp.if.pw.edu.pl/pojava";
		// objasnienie opisu bazy:
		// jdbc: - mechanizm laczenia z baza (moze byc inny, np. odbc)
		// mysql: - rodzaj bazy
		// //olimp.if.pw.edu.pl - adres serwera z baza (moze byc tez w formie adresu IP)
		// /pojava - nazwa bazy (poniewaz na serwerze moze byc kilka roznych baz...)
		String user = "pojava";
		String pass = "Java";
		java.sql.Connection conn = null;
        try {
			conn=DriverManager.getConnection(baza, user, pass);
			//rownoznacze z zapisem:
			//conn=DriverManager.getConnection("jdbc:mysql://olimp.if.pw.edu.pl/pojava?user=pojava&password=Java");
		} catch (SQLException e) {
			System.out.println("Blad przy ladowaniu sterownika bazy!");
			System.exit(1);
		}
		System.out.print(" polaczenie OK\n");
		
    }
    public double StanKonta = 0;
    //TODO: pobrac inne pliki wsdl, zaimportowac je (prawy -> new -> web service cliennt ...
    //bedziemy mogli z nich korzystac -> dzieki temu dostaniemy liste produktow i liste plac
    /**
     * Funkcja dodajaca nowa sprzedaz do ksiegowosci
     *
     * @param produkt
     * @param kodSprzedazy
     */
    @WebMethod(operationName = "dodaj_sprzedaz")
    public void dodajSprzedaz(@WebParam(name = "produkt") List<Produkt> produkt,@WebParam(name = "kodSprzedazy") int kodSprzedazy) {
        //zamiast List<Produkt> produkt, moze List<Pair<Integer, Double>> produkt ??
        System.out.println("Ok - dodaj_sprzedaz");
    }

    /**
     * Funkcja dodajaca nowy zakup do ksiegowosci
     *
     * @param produkt
     * @param kodZakupu
     */
    @WebMethod(operationName = "dodaj_zakup")
    public void dodajZakup(@WebParam(name = "produkt") List<Produkt> produkt,@WebParam(name = "kodZakupu") int kodZakupu) {
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
    public double pobierzStanKonta() {
        double stanKonta = 0.0;
        return stanKonta;
    }

    /**
     * Funkcja odpowiedzialna za sprawdzenie wybranego paragonu/faktury
     * zakupu/sprzedazy
     *
     * @param idSprzedazy
     * @return
     */
    @WebMethod(operationName = "pobierz_info_o_zakupie")
    public List<Produkt> pobierzInfoZakup(@WebParam(name = "idSprzedazy") int idSprzedazy) {
        List<Produkt> tmp = new ArrayList<>();
        if (/*!tmp.find(idSprzedazy)*/false) {
            return null;
        } else {
            return tmp;
        }
    }
}
