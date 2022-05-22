package lesson_2;

public class Uncertain {
    public static int[] array5(int len, int initialValue) {
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }
        return a;

    }
}

