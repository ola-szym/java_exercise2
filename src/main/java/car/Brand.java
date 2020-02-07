package car;

public enum Brand {
    ALFA_ROMEO(120000),
    AUDI(200000),
    BMW(200000),
    CITROEN(80000),
    FIAT(80000),
    SKODA(80000);

    private int value;

    Brand(int value){
        this.value = value;
    }

    public int getValue() { return value; }
}
