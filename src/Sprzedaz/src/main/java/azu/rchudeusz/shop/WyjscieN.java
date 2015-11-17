package azu.rchudeusz.shop;

/**
 *
 * @author rchudeusz,jwislak
 */
public class WyjscieN {

    boolean naprawa;
    boolean zwrot;

    public WyjscieN(boolean naprawa, boolean zwrot) {
        this.naprawa = naprawa;
        this.zwrot = zwrot;
    }

    public boolean isNaprawa() {
        return naprawa;
    }

    public void setNaprawa(boolean naprawa) {
        this.naprawa = naprawa;
    }

    public boolean isZwrot() {
        return zwrot;
    }

    public void setZwrot(boolean zwrot) {
        this.zwrot = zwrot;
    }

    @Override
    public String toString() {
        return "WyjscieN{" + "naprawa=" + naprawa + ", zwrot=" + zwrot + '}';
    }

}
