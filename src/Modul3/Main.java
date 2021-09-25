package Modul3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] imena = name.trim().split(" ");
        return imena.length == 3;
    }

    private static String formatName(String name) {
        String[] imena = name.trim().split(" ");
        sortByLength(imena);
        String result = "";
        for (int i = 0; i < imena.length; i++) {
            String str = imena[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] imena) {
        for (int i = 0; i < imena.length - 1; i++) {
            for (int j = 0; j < imena.length - 1; j++) {
                if (imena[j].length() > imena[j + 1].length()) {
                    String tmp = imena[j];
                    imena[j] = imena[j + 1];
                    imena[j + 1] = tmp;
                }
            }
        }
    }
}