package Lesson_4;

public class Plate {
    private int food;

    public Plate(int n) {
        if (n < 0) {
            System.out.println(n + " недействительное значение. Тарелка может быть либо пуста, либо" +
                    " содержать некое количество единиц еды.");
        }
        if (n == 0) {
            System.out.println("Тарелка пуста.");
        }
        if (n > 0) {
            food = n < 0 ? -n : n;
            info();
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n > food) {

            return false;
        } else {
            food -= n;
            return true;
        }
    }


    public void addFood(int n) {
        food += n < 0 ? -n : n;
    }

    public void info() {
        System.out.println("В тарелке " + food + " единиц еды.");
    }

}
