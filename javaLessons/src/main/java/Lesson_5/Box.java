public class Box <T extends Integer,V extends Number> {
    private T nameO ;
    private V nameA ;

public Box(){

}
    public T getNameO() {
        return nameO;
    }

    public V getNameA() {
        return nameA;
    }

    public Box(T nameO) {
        this.nameO = nameO;
    }

    public Box(V nameA) {
        this.nameA = nameA;
    }

}