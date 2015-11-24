package azu.rchudeusz.shop;

/**
 *
 * @author rchudeusz, jwislak
 */

public class Item2 {

    long kod_produktu;
    int ilosc;


    public Item2() {

    }
    /**
     * 
     * @param kod_produktu
     * @param ilosc 
     */
    public Item2(long kod_produktu, int ilosc) {
        this.kod_produktu = kod_produktu;
        this.ilosc = ilosc;
    }

    public long getKod_produktu() {
        return kod_produktu;
    }

    public void setKod_produktu(long kod_produktu) {
        this.kod_produktu = kod_produktu;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

}
