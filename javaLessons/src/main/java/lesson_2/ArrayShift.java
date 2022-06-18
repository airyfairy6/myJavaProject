package lesson_2;

//  при n меньше нуля  - сдвиг влево; при n больше нуля сдвиг вправо.
public class ArrayShift {
    public static int[] shift(int[] arr, int n) {
        if (n >= 0) {
            for (int j = 1; j <= n; j++) {
                int k = arr[arr.length - 1];

                for (int i = arr.length - 1; i >= 0; i--) {
                    if (i != 0) {
                        arr[i] = arr[i - 1];
                    } else {

                        arr[i] = k;
                    }
                }
            }
        }
        if (n < 0) {
            for (int j = 1; j <= Math.abs(n); j++) {
                int k = arr[0];

                for (int i = 0; i <= arr.length - 1; i++) {
                    if (i != (arr.length - 1)) {
                        arr[i] = arr[i + 1];
                    } else {

                        arr[i] = k;
                    }
                }
            }
        }
        return arr;
    }
}