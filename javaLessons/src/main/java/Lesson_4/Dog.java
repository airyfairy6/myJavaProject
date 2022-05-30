package Lesson_4;

public class Dog extends Animal {
    public Dog() {
    }

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    int dogCount;

    int dogCount() {
        this.dogCount = dogCount;
        dogCount++;
        return dogCount;
    }

    @Override
    public void run(int barrier) {
        if (barrier > 500) {
            System.out.println("Собака " + name + " пробежала 500 м и остановилась. Дальше бежать не может.");
        } else
            System.out.println("Собака " + name + " пробежала " + barrier + " м.");
    }

    @Override
    public void swim(int barrier) {
        if (barrier > 10) {
            System.out.println("Собака " + name + " проплыла 10 м и остановилась. Дальше плыть не может.");
        } else
            System.out.println("Собака " + name + " проплыла " + barrier + " м.");

    }
}
