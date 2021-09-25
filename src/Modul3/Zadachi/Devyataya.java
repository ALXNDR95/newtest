package Modul3.Zadachi; // В классе объявлен пустой массив strings и целое число size. Вам требуется вывести квадратную доску размером size x size. Пример при size = 4:

      /*A4 B4 C4 D4
        A3 B3 C3 D3
        A2 B2 C2 D2
        A1 B1 C1 D1*/

public class Devyataya {
        public static short size = 9;
        public static String[][] strings;

        public static void main(String[] args) {
            strings = new String[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    strings[i][j] = (char) ('A' + j) + String.valueOf(size - i);
                }
            }

            for (int i = 0; i < size; i++) {
                System.out.println(String.join(" ", strings[i]));
            }
        }
    }

