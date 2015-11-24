/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.pracownicy;

import java.util.ArrayList;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 * @author kuba hudzik
 * @author Michal
 */
@WebService(serviceName = "Pracownicy")
public class Pracownicy {

      
    
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
