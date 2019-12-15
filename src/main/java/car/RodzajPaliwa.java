package car;

public enum RodzajPaliwa {
    DIESEL(3000),
    BENZYNA(0);

    private int wartosc;

    RodzajPaliwa(int wartosc){
        this.wartosc = wartosc;
    }

    public int getWartosc() { return wartosc; }
}
