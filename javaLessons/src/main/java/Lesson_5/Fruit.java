public class Fruit <T extends Integer,V extends Number> {
    private T nameO;
    private V nameA;

    public Fruit() {

    }

    public T getNameO() {
        return nameO;
    }

    public V getNameA() {
        return nameA;
    }

    public Fruit(T nameO) {
        this.nameO = nameO;
    }

    public Fruit(V nameA) {
        this.nameA = nameA;
    }


}