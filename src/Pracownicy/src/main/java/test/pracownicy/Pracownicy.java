/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pracownicy;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 * @author kuba hudzik nn
 * @author Michal
 * @author Łukasz Winkler
 */
@WebService(serviceName = "Pracownicy")
public class Pracownicy {

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
		String baza = "";
		String user = "";
		String pass = "";
		java.sql.Connection conn = null;
        try {
			conn=DriverManager.getConnection(baza, user, pass);
			} catch (SQLException e) {
			System.out.println("Blad przy ladowaniu sterownika bazy!");
			System.exit(1);
		}
		System.out.print(" polaczenie OK\n");
		
    }  
    
    @WebMethod(operationName = "Dodaj")
    public String Dodaj(String imie, String nazwisko, 
                String adres, String pesel, String stanowisko, double pensja) {
        return pesel;
    }
    @Oneway
    @WebMethod(operationName = "Usun")
    public void Usun(String pesel) {
        }
    @Oneway
    @WebMethod(operationName = "Edytuj") 
    public void Edytuj(String imie, String nazwisko, 
                String adres, String stanowisko, String pensja) {
        }
    
    @WebMethod(operationName = "ListaPlac")
    public List<ListaPlac> pobierzListePlac() {
        List<ListaPlac> lista = new ArrayList<>();
        return lista;
    }
}
    
