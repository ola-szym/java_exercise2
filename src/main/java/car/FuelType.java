package car;

public enum FuelType {
    DIESEL(3000),
    PETROL(0);

    private int value;

    FuelType(int value){
        this.value = value;
    }

    public int getValue() { return value; }
}
