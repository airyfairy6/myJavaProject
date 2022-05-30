package Lesson_4;

public class Animal {
    private String name;

    public Animal() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    int animalCount;

    int animalCount() {
        this.animalCount = animalCount;
        animalCount++;
        return animalCount;
    }

    public void run(int barrier) {
        System.out.println("Животное пробежало " + barrier + " м.");
    }

    public void swim(int barrier) {
        System.out.println("Животное проплыло " + barrier + " м.");

    }
}

