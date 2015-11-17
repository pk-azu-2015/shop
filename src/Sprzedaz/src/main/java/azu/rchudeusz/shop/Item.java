package azu.rchudeusz.shop;

/**
 *
 * @author rchudeusz,jwislak
 */
public class Item {

    long kod_sprzedazy;
    long kod_produktu;

    /**
     *
     * @param kod_sprzedazy
     * @param kod_produktu
     */
    public Item(long kod_sprzedazy, long kod_produktu) {
        this.kod_sprzedazy = kod_sprzedazy;
        this.kod_produktu = kod_produktu;
    }

    public Item() {
    }

    public long getKod_sprzedazy() {
        return kod_sprzedazy;
    }

    public void setKod_sprzedazy(long kod_sprzedazy) {
        this.kod_sprzedazy = kod_sprzedazy;
    }

    public long getKod_produktu() {
        return kod_produktu;
    }

    public void setKod_produktu(long kod_produktu) {
        this.kod_produktu = kod_produktu;
    }

}
