package car;

public enum Color {
    WHITE(0),
    BLACK(5000),
    RED(7000);

    int value;

    Color(int value){
        this.value = value;
    }

    public int getValue(){ return value; }
}
