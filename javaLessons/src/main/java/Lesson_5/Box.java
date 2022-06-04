public class Box<T extends String, V> {
    private T nameO;
    private V nameA;
    private int fullness;
    private float weightOfBox;
    private float weightPerEachFruit;

    public Box() {
    }

    public int addFruitToBoxO(Orange<T> c) {
        return fullness = fullness + c.getQuantityO();
    }

    public int addFruitToBoxA(Apple<V> c) {
        return fullness = fullness + c.getQuantityA();
    }


    public float getWeightPerEachFruit() {
        return weightPerEachFruit;
    }


    public int getFullness() {
        return fullness;
    }

    public float getWeightPerEachFruitBO(Orange<T> c) {
        return weightPerEachFruit = (float) (weightPerEachFruit + c.getWeightO());
    }

    public float getWeightPerEachFruitBA(Apple<V> c) {
        return weightPerEachFruit = (float) (weightPerEachFruit + c.getWeightA());
    }


    public float getWeightOfBox() {
        return weightOfBox;
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

    public float getWeight() {
        return weightOfBox = (float) (getWeightOfBox() + (getFullness() * getWeightPerEachFruit()));

    }


    public boolean compare(Box<T, V> c) {
        if (c.weightOfBox == weightOfBox) {
            System.out.println("Коробки весят одинаково.");
            return true;
        } else {
            System.out.println("Вес коробок отличается.");
            return false;
        }
    }

    public void passOrange(Box<T, V> c) {
        int k = fullness;
        fullness = 0;
        c.fullness = k + c.fullness;
    }

    public void passApple(Box<T, V> c) {
        int k = fullness;
        fullness = 0;
        c.fullness = k + c.fullness;
    }


}
