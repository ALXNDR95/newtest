package Modul3.Zadachi;  // В классе объявлен массив numbers. Заполните его числами так, чтобы содержимое выглядело следующим образом: [1, -2, 3, -4, 5, …, -98, 99, -100].

import java.util.Arrays;

public class Pyataya {
        public static int[] numbers = new int[100];

        public static void main(String[] args) {
            numbers[0] = 1;

            for (int i = 0, stop = numbers.length; i < stop; i++) {
                numbers[i] = (int) (Math.pow(-1, i) * (numbers[i] + i));
            }

            System.out.println(Arrays.toString(numbers));
        }
    }

