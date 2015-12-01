package azu.rchudeusz.shop;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author rchudeusz, jwislak
 */

public class WyjscieS {

    List<Item> lista;
    long kodSprzedazy;

    public WyjscieS() {
    }

    public WyjscieS(List<Item> lista, long cena) {
        this.kodSprzedazy = cena;
        this.lista = lista;
    }

    public long getCena() {
        return kodSprzedazy;
    }

    public void setCena(long kodSprzedazy) {
        this.kodSprzedazy = kodSprzedazy;
    }

    public List<Item> getLista() {
        return lista;
    }

    public void setLista(List<Item> lista) {
        this.lista = lista;
    }



}
