package azu.rchudeusz.shop;

import java.util.List;

/**
 *
 * @author rchudeusz
 */
public class WyjscieS {

    double cena;
    List<Item> lista;

    public WyjscieS() {
    }

    public WyjscieS(double cena, List<Item> lista) {
        this.cena = cena;
        this.lista = lista;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public List<Item> getLista() {
        return lista;
    }

    public void setLista(List<Item> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "WyjscieS{" + "cena=" + cena + ", lista=" + lista + '}';
    }

}
