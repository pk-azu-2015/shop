package com.nyga.azu.asortyment;

import java.math.BigDecimal;

/**
 *
 * @author nyga
 */
public class Produkt {

    private String nazwa;
    private String opis;
    private long kodProduktu;
    private BigDecimal cena;

    public Produkt(long kodProduktu, String nazwa, String opis, BigDecimal cena) {
        this.nazwa = nazwa;
        this.kodProduktu = kodProduktu;
        this.opis = opis;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public long getKodProduktu() {
        return kodProduktu;
    }

    public void setKodProduktu(long kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

}
