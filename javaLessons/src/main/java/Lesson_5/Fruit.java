public class Fruit<T extends String, V> {
    private T nameO;
    private V nameA;
    private float weight;
    private int quantity;

    public Fruit() {

    }


    public int getQuantity() {
        return quantity;
    }

    public Fruit(int quantity) {
        this.quantity = quantity;
    }


    public T getNameO() {
        return nameO;
    }

    public V getNameA() {
        return nameA;
    }


    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }


    public Fruit(T nameO, int quantity) {
        this.nameO = nameO;
        this.quantity = quantity;
    }

    public Fruit(V nameA) {
        this.nameA = nameA;
    }


}


