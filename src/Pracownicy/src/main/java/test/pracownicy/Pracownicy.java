package test.pracownicy;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kuba Hudzik
 * @author Michal Szaleniec 
 * @author Łukasz Winkler
 */
@WebService(serviceName = "Pracownicy")
public class Pracownicy {

    java.sql.Connection conn = null;

    private void polaczenieZBaza() {
        // LADOWANIE STEROWNIKA
        System.out.print("Sprawdzanie sterownika:");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch (ClassNotFoundException | InstantiationException |
               IllegalAccessException e) {
            System.out.println("Blad przy ladowaniu sterownika bazy!");
            System.exit(1);
        }
        System.out.print("Sterownik OK");

        // LACZENIE Z BAZA
        System.out.print("\nLaczenie z baza danych:");
        String baza = "jdbc:mysql://db4free.net/azu2015";
        String user = "azu2015";
        String pass = "azu2015";
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

    @WebMethod(operationName = "Dodaj")
    public String Dodaj(@WebParam(name = "imie") String imie, @WebParam(name = "nazwisko") String nazwisko,
                        @WebParam(name = "adres") String adres, @WebParam(name = "pesel") String pesel, @WebParam(name = "stanowisko") String stanowisko,
                        @WebParam(name = "pensja") double pensja) {
        
        polaczenieZBaza();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            stat.executeQuery(
                    "INSERT INTO Pracownicy (imie, nazwisko, adres, pesel, stanowisko, pensja) VALUES "
                                        + "("+imie +","+ nazwisko +","+ adres +","+ pesel 
                                        +","+ stanowisko +","+ pensja+");");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(stat);
        }
        return pesel;
    }

    @Oneway
    @WebMethod(operationName = "Usun")
    public void Usun(@WebParam(name = "pesel") String pesel) {
        polaczenieZBaza();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            stat.executeQuery(
                    "DELETE FROM Pracownicy WHERE PESEL=" + pesel + ";");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(stat);
        }
    }

    @Oneway
    @WebMethod(operationName = "Edytuj")
    public void Edytuj(@WebParam(name = "imie") String imie, @WebParam(name = "nazwisko") String nazwisko,
                       @WebParam(name = "adres") String adres, @WebParam(name = "stanowisko") String stanowisko, @WebParam(name = "pensja") /*String?? a nie double */String pensja) {
        
        polaczenieZBaza();
        Statement stat = null;
        try {
            stat = conn.createStatement();
            stat.executeQuery(
                    
                    "UPDATE Pracownicy SET imie="+imie+"nazwisko="+nazwisko+
                            "adres="+adres+"stanowisko="+stanowisko+"pensja="+pensja+";"); /* dodac WHERE cos = ?? */
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(stat);
        }

    }

    @WebMethod(operationName = "ListaPlac")
    public List<ListaPlac> pobierzListePlac() {
        List<ListaPlac> lista = new ArrayList<>();
        return lista;
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
