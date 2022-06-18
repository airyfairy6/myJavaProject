package Lesson_4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    private String name;
    private int appetite;
    private int saturation;
    private int fullness;
    private boolean full;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.saturation = 0;
        this.full = false;
        this.fullness = this.appetite;

    }

    @Override
    public String getName() {
        return name;
    }

    public int getSaturation() {
        return saturation;
    }

    public int getFullness() {
        return fullness;
    }

    public int getAppetite() {
        return appetite;
    }


    public boolean full() {
        return full;
    }

    int catCount;

    int catCount() {
        this.catCount = catCount;
        catCount++;
        return catCount;
    }

    public void eat(Plate p) {
        if (this.full) {
            return;
        }
        if (p.decreaseFood(this.appetite)) {
            System.out.println(this.name + " съел " + this.appetite + " единиц еды.");

            this.saturation += this.appetite;
            if (this.saturation == this.fullness) {
                this.full = true;
            }
        }
    }


    @Override
    public void run(int barrier) {
        if (barrier > 200) {
            System.out.println("Кот " + name + " пробежал 200 м и остановился. Дальше бежать не может.");
        } else
            System.out.println("Кот " + name + " пробежал " + barrier + " м.");


    }

    @Override
    public void swim(int barrier) {
        System.out.println("Кот " + name + " не умеет плавать.");

    }
}


