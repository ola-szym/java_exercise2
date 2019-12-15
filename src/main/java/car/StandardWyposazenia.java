package car;

public enum StandardWyposazenia {

    PREMIUM(20000),
    VIP(50000),
    BASIC(0);

    int wartosc;

    StandardWyposazenia(int wartosc){
        this.wartosc = wartosc;
    }

    public int getWartosc() { return wartosc; }
}
