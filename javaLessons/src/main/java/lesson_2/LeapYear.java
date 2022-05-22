package lesson_2;

public class LeapYear {
    public static boolean check(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            return true;
        }
        return false;
    }

}
