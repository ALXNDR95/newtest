package Modul3;

import java.util.Arrays;

/*public class ArraysExample {                                // циклы while / do...while
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5};
        int[] arr2 = new int[]{1, 4, 56, 7};
        int[] arr3 = new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int a = 10;
        int b = 15;
        while (a < b) {
            System.out.println("a=" + a++);
        }
        do {
            System.out.println("a=" + a++);
        } while (a < b);
    }
}*/

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5};
        int[] arr2 = new int[]{1, 4, 56, 7};
        int[] arr3 = new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        for (int i : arr) {
            System.out.println(i);
        }

        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10)
                continue;
            System.out.println(arr[i]);
        }*/

        int a = 10;
        int b = 15;

    }
}
