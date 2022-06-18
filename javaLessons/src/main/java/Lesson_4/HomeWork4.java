package Lesson_4;

public class HomeWork4 {
    public static void main(String[] args) {
        //ЗАДАНИЕ 7
        Park park = new Park();
        park.info("Лесное озеро");

        Park.Attraction[] range = new Park.Attraction[]{
                new Park().new Attraction("A", 15, "10:00- 18:00"),
                new Park().new Attraction("B", 10, "10:00- 17:00"),
                new Park().new Attraction("C", 13, "10:00- 16:00"),
        };

        System.out.println();
        for (Park.Attraction y : range) {
            y.infoAttraction();

        }
        //ЗАДАНИЕ 6
        System.out.println();
        Payment purchase = new Payment();


        Payment.Products[] productRange = new Payment.Products[]{
                new Payment().new Products("A", 8),
                new Payment().new Products("B", 5),
                new Payment().new Products("C", 7)
        };

        System.out.println();
        for (Payment.Products y : productRange) {
            y.infoProducts();

        }

        System.out.println();
        purchase.set(productRange[0], 6);
        purchase.set(productRange[1], 5);
        purchase.set(productRange[2], 7);

        //ЗАДАНИЕ 1-4
        System.out.println();
        Animal animal = new Animal();
        animal.animalCount();
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
        System.out.println();
        //ЗАДАНИЕ 5
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


    }
}
