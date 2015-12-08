/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Konrad Żabicki, Jakub Woźniak
 */
@WebService(serviceName = "Klienci")
public class Klienci {

    java.sql.Connection conn=null;
    
       public void polaczenieDoBazyDanych(){
           System.out.println("Proba nawiazania polaczenia ze sterownikiem");
           
           try{
               Class.forName("com.mysql.jdbc.Driver").newInstance();
           }
           
           catch(ClassNotFoundException | InstantiationException |
               IllegalAccessException e){
               
               
            System.out.println("Blad przy ladowaniu sterownika bazy!");
            System.exit(1);
        }
        System.out.print("Sterownik OK");
        
             System.out.print("Sterownik OK");

        // LACZENIE Z BAZA
        System.out.print("\nLaczenie z baza danych:");
        String baza = "jdbc:mysql://db4free.net/azu2015klienci";
        String user = "kubawozniak";
        String pass = "bazaazu";
        java.sql.Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(baza, user, pass);
        }
        catch (SQLException e) {
            System.out.println("Blad przy ladowaniu sterownika bazy!!");
            System.exit(1);
        }
        System.out.print(" polaczenie OK\n");

    
       }
    
    
    @WebMethod(operationName = "dodaj_klienta")
    public void dodajKlienta(@WebParam(name = "imie") String imie, 
                @WebParam(name = "nazwisko") String nazwisko, 
                @WebParam(name = "adres") String adres, 
                @WebParam( name = "NIP" )int NIP, 
                @WebParam(name = "nrTel")int nrTel, 
                @WebParam(name = "PESEL")long PESEL) {
        polaczenieDoBazyDanych();
        
        Statement statement = null;
        
        try{
            statement=conn.createStatement();
            
            statement.executeUpdate("Insert INTO klienci " + 
                    "(imie, nazwisko, adres, NIP, nrTel, PESEL) values " 
                    + "(" + imie + "," 
                    + nazwisko + ","
                    + adres + ","
                    + NIP + ","
                    + nrTel + ","
                    + PESEL + ");" );
            
        }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
       }     
            
       System.out.println("Dodano klienta do bazy");
       
       closeConnection(statement);
    
    }
    
    
     /**
     * Metoda, ktora usuwa klienta
     *
     * @param ID_klienta
     */ 
    @Oneway
    @WebMethod(operationName = "usun")
    public void Usun(long PESEL) {
        
        polaczenieDoBazyDanych();
        
        
        Statement statement = null;
        
        try{
            statement = conn.createStatement();
            statement.executeQuery("Delete FROM klienci WHERE PESEL = " + PESEL +";");
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
         System.out.println("Dodano klienta do bazy");
       
       closeConnection(statement);
    
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
    public void Edytuj(@WebParam( name = "imie") String imie, 
                       @WebParam( name = "nazwisko") String nazwisko,
                       @WebParam( name = "adres") String adres, 
                       @WebParam( name="nrTel") int nrTel) {
        
    }   
    
    /**
     * Metoda dodajaca zakup do historii zakopow
     *
     */
    @Oneway
    @WebMethod(operationName = "dodaj_do_historii_zakupow")
    public void  dodajDoHistorii(@WebParam(name ="kodSprzedazy")int kodSprzedazy, 
            @WebParam(name = "PESEL")long PESEL) {
      
        
        
        
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