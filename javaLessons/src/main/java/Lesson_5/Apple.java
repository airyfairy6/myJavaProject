public class Apple<V> extends Fruit {

    private V name;
    private float weightA;
    private int quantityA;

    public Apple(V name, int quantityA) {
        this.name = name;
        this.quantityA = quantityA;
    }

    public Apple(float weightA) {
        this.weightA = weightA;
    }

    public V getName() {
        return name;
    }

    public float getWeightA() {
        return 1.0f;
    }

    public int getQuantityA() {
        return quantityA;
    }
}
