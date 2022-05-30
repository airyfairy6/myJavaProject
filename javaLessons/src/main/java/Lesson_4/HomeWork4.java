package Lesson_4;

public class HomeWork4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animalCount();

        Cat[] cat = {
                new Cat("01", 5),
                new Cat("02", 1),
                new Cat("03", 6),
                new Cat("04", 8),
        };

        Plate plate = new Plate(0);
        for (Cat c : cat) {
            while (!c.full() && plate.getFood() >= c.getAppetite()) {

                c.eat(plate);
                plate.info();
            }
        }
        for (Cat c : cat) {
            if (c.full()) {
                System.out.println(c.getName() + " наелся.");
            }
            if (!c.full()) {
                System.out.println(c.getName() + " остался голодным. Ему не хватило " + (c.getFullness() - plate.getFood()) + "  единиц еды.");
            }
        }

        System.out.println();

        Cat kitty = new Cat("Китти");
        kitty.run(501);
        kitty.swim(11);
        kitty.catCount();

        Dog dog = new Dog("Гав-гав");
        dog.run(501);
        dog.swim(11);
        dog.dogCount();

        System.out.println();
        System.out.println("Всего создано " + (kitty.catCount + dog.dogCount) + " животное(ых).");
        System.out.println("Всего создан(о) " + kitty.catCount + " кот(ов).");
        System.out.println("Всего создан(о) " + dog.dogCount + " собак(а).");


    }
}
