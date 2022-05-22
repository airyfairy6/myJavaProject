package lesson_2;

public class DefinedArray {
    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;

            }
        }
    }
}
