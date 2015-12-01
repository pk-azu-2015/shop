package azu.rchudeusz.shop;

import java.math.BigDecimal;

/**
 *
 * @author rchudeusz, jwislak
 */

public class Item {

    private long kod_produktu;
    private BigDecimal cena;

    /**
     *
     * @param kod_produktu
     * @param cena
     */
    public Item(long kod_produktu, BigDecimal cena) {
        this.cena = cena;
        this.kod_produktu = kod_produktu;
    }

    public Item() {
    }

    public long getKod_produktu() {
        return kod_produktu;
    }

    public void setKod_produktu(long kod_produktu) {
        this.kod_produktu = kod_produktu;
    }

    /**
     * @return the cena
     */
    public BigDecimal getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

}
