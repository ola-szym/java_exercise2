package car;

public enum EquipmentStandard {

    PREMIUM(20000),
    VIP(50000),
    BASIC(0);

    int value;

    EquipmentStandard(int value){
        this.value = value;
    }

    public int getValue() { return value; }
}
