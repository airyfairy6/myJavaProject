package lesson_2;

public class BelowOrAboveNull {
    public static void check(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число или ноль");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }
}
