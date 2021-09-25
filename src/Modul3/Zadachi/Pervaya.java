package Modul3.Zadachi;  // Создание и инициализация массива: 5, 24, 3, 66, 38, 16, 27. Проведение сортировки массива и выведение 3-го элемента массива

import java.util.Arrays;

public class Pervaya {    /*public class CycleFor {*/
        public static void main(String[] args) {
            int[] array = {5, 24, 3, 66, 38, 16, 27};
            Arrays.sort(array);
            System.out.println(array[2]);
        }
    }

