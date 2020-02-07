package car;

public enum GearBoxType {
    AUTOMATIC (10000),
    MANUAL (0);

    private int value;

    GearBoxType(int value){
        this.value = value;
    }

    public int getValue() { return value; }
}
