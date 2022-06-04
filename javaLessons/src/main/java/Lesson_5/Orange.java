public class Orange<T extends String> extends Fruit {

    private T name;
    private float weightO;
    private int quantityO;


    public Orange(T name, int quantityO) {
        this.name = name;
        this.quantityO = quantityO;
    }


    public Orange(float weightO) {
        this.weightO = weightO;
    }

    public float getWeightO() {
        return 1.5f;
    }

    public T getName() {
        return name;
    }

    public int getQuantityO() {
        return quantityO;
    }
}
