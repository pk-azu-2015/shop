package azu.rchudeusz.shop;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author rchudeusz, jwislak
 */

public class WyjscieS {

    BigDecimal cena;
    List<Item> lista;

    public WyjscieS() {
    }

    public WyjscieS(BigDecimal cena, List<Item> lista) {
        this.cena = cena;
        this.lista = lista;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
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
