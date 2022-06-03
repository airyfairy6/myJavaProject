public class Orange<T extends Integer> extends Fruit{

    private T name;

        public Orange(T name) {
            this.name=name;}


    public T getName() {
        return name;
    }


}

