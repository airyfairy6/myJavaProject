public class Apple <V extends Number> extends Fruit {

    private V name;

    public Apple(V name) {
        this.name=name;
        }


    public V getName() {
        return name;
    }


}
