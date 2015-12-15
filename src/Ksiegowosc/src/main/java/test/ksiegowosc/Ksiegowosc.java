/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ksiegowosc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

        System.out.print("\nLaczenie z baza danych:");
        String baza = "jdbc:mysql://db4free.net/azu2015";
        String user = "azu2015";
        String pass = "azu2015";

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
    public void dodajSprzedaz(@WebParam(name = "produkt") List<Produkt> produkt, @WebParam(name = "kodSprzedazy") long kodSprzedazy) {
        polaczenieZBaza();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            for (Produkt pr : produkt) {
                statement.executeUpdate("INSERT into Sprzedaz "
                        + "(kod_sprzedazy, kod_produktu, cena) values"
                        + "(" + kodSprzedazy + ", "
                        + pr.getKodProduktu() + ", "
                        + pr.getCena() + ");");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            closeConnection(statement);
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
            closeConnection(statement);
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
     * @param idZakupu
     * @return
     */
    @WebMethod(operationName = "pobierz_info_o_zakupie")
    public List<Produkt> pobierzInfoZakup(@WebParam(name = "idZakupu") long idZakupu) {
        List<Produkt> produkt = new ArrayList<>();

        polaczenieZBaza();
        Statement statement = null;

        try {
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select from Zakup where kod_sprzedazy = " + idZakupu + ";");

            while (rs.next()) {
                Produkt tmp = new Produkt();
                tmp.setKodProduktu(rs.getInt("kod_produktu"));
                tmp.setCena(rs.getBigDecimal("cena"));
                produkt.add(tmp);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            closeConnection(statement);
        }

        return produkt;
    }

    /**
     * Funkcja odpowiedzialna za sprawdzenie wybranego paragonu/faktury
     * zakupu/sprzedazy
     *
     * @param idSprzedazy
     * @return
     */
    @WebMethod(operationName = "pobierz_info_o_sprzedazy")
    public List<Produkt> pobierzInfoSprzedaz(@WebParam(name = "idSprzedazy") long idSprzedazy) {
        List<Produkt> produkt = new ArrayList<>();

        polaczenieZBaza();
        Statement statement = null;

        try {
            statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select from Sprzedaz where kod_sprzedazy = " + idSprzedazy + ";");

            while (rs.next()) {
                Produkt tmp = new Produkt();
                tmp.setKodProduktu(rs.getInt("kod_produktu"));
                tmp.setCena(rs.getBigDecimal("cena"));
                produkt.add(tmp);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            closeConnection(statement);
        }

        return produkt;
    }

    private void closeConnection(Statement statement) {
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
}