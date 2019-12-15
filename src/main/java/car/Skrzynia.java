package car;

public enum Skrzynia {
    AUTOMATYCZNA (10000),
    MANUALNA(0);

    private int wartosc;

    Skrzynia(int wartosc){
        this.wartosc = wartosc;
    }

    public int getWartosc() { return wartosc; }
}
