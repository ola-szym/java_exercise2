package car;

public enum Kolor {
    BIALY(0),
    CZARNY(5000),
    CZERWONY(7000);

    int wartosc;

    Kolor(int wartosc){
        this.wartosc = wartosc;
    }

    public int getWartosc(){ return wartosc; }
}
