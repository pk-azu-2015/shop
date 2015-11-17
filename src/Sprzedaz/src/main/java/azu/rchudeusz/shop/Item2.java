package azu.rchudeusz.shop;

/**
 *
 * @author rchudeusz,jwislak
 */
public class Item2 {

    String kod_produktu;
    String ilosc;

    /**
     *
     * @param kod_sprzedazy
     * @param kod_produktu
     */
    public Item2() {

    }

    public Item2(String kod_produktu, String ilosc) {
        this.kod_produktu = kod_produktu;
        this.ilosc = ilosc;
    }

    public String getKod_produktu() {
        return kod_produktu;
    }

    public void setKod_produktu(String kod_produktu) {
        this.kod_produktu = kod_produktu;
    }

    public String getIlosc() {
        return ilosc;
    }

    public void setIlosc(String ilosc) {
        this.ilosc = ilosc;
    }

}
