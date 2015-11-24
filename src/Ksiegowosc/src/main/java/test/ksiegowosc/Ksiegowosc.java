/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ksiegowosc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author student
 */
@WebService(serviceName = "Ksiegowosc")
public class Ksiegowosc {

    java.sql.Connection conn = null;

    private void polaczenieZBaza() {
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
        String baza = "";
        String user = "";
        String pass = "";
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(baza, user, pass);
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
    public void dodajSprzedaz(@WebParam(name = "produkt") List<Produkt> produkt, @WebParam(name = "kodSprzedazy") int kodSprzedazy) {
        polaczenieZBaza();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            for (Produkt pr : produkt) {
                statement.executeUpdate("INSERT into Zakup "
                        + "(kod_sprzedazy, kod_produktu, cena) values"
                        + "(" + kodSprzedazy + ", "
                        + pr.getKodProduktu() + ", "
                        + pr.getCena() + ");");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        
        System.out.println("Ok - dodaj_sprzedaz");
    }

    /**
     * Funkcja dodajaca nowy zakup do ksiegowosci
     *
     * @param produkt
     * @param kodZakupu
     */
    @WebMethod(operationName = "dodaj_zakup")
    public void dodajZakup(@WebParam(name = "produkt") List<Produkt> produkt, @WebParam(name = "kodZakupu") int kodZakupu) {
        polaczenieZBaza();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            for (Produkt pr : produkt) {
                statement.executeUpdate("INSERT into Zakup "
                        + "(kod_zakupu, kod_produktu, cena) values"
                        + "(" + kodZakupu + ", "
                        + pr.getKodProduktu() + ", "
                        + pr.getCena() + ");");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

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