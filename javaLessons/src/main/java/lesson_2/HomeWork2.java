package lesson_2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {


        System.out.println(Sum.checkSum(11, 10));
        BelowOrAboveNull.check(-15);
        System.out.println(BelowOrAboveNull2.check(0));
        PrintMalti.print("Hello!", 1);
        System.out.println(LeapYear.check(20));

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Exchange.array(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[100];
        EmptyArray.array1(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        DefinedArray.array(arr2);
        System.out.println(Arrays.toString(arr2));

        int[][] arr3 = new int[6][6];
        TwoDimensArray.array(arr3);

        System.out.println(Arrays.toString(Uncertain.array5(3, 5)));

        int[] arr4 = {1, 5, 3, 2, 11};
        int[] arr5 = ArrayShift.shift(arr4, 0);
        System.out.println(Arrays.toString(arr5));
    }
}
