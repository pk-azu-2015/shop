/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.ksiegowosc;

import java.math.BigDecimal;

/**
 *
 * @author Michal
 */
public class Produkt {
    private long kodProduktu;
    private BigDecimal cena;

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
