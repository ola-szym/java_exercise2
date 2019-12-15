package car;

public enum Marka {
    ALFA_ROMEO(120000),
    AUDI(200000),
    BMW(200000),
    CITROEN(80000),
    FIAT(80000),
    SKODA(80000);

    private int wartosc;

    Marka(int wartosc){
        this.wartosc = wartosc;
    }

    public int getWartosc() { return wartosc; }
}
