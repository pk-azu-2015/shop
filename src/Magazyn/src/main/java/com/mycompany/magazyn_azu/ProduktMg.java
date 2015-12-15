package com.mycompany.magazyn_azu;

import java.math.BigDecimal;

/**
 *
 * @author nyga
 */
public class ProduktMg {
 private long kodProduktu; 
 private long ilosc; 

    public ProduktMg(long kodProduktu, long ilosc) {
        this.kodProduktu = kodProduktu;
        this.ilosc = ilosc;
    }

    public long getKodProduktu() {
        return kodProduktu;
    }

    public long getIlosc() {
        return ilosc;
    }

    public void setKodProduktu(long kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    public void setIlosc(long ilosc) {
        this.ilosc = ilosc;
    }
  
   
    
   

   
}
