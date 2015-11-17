package azu.rchudeusz.shop;

/**
 *
 * @author rchudeusz,jwislak
 */
public class Item {

    String kod_sprzedazy;
    String kod_produktu;

    /**
     *
     * @param kod_sprzedazy
     * @param kod_produktu
     */
    public Item(String kod_sprzedazy, String kod_produktu) {
        this.kod_sprzedazy = kod_sprzedazy;
        this.kod_produktu = kod_produktu;
    }

    public Item() {
    }

    public String getKod_sprzedazy() {
        return kod_sprzedazy;
    }

    public void setKod_sprzedazy(String kod_sprzedazy) {
        this.kod_sprzedazy = kod_sprzedazy;
    }

    public String getKod_produktu() {
        return kod_produktu;
    }

    public void setKod_produktu(String kod_produktu) {
        this.kod_produktu = kod_produktu;
    }

}
