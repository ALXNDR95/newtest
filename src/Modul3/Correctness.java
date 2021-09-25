package Modul3;

import java.util.Scanner;

public class Correctness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }
    private static boolean checkName(String name) {
        String[] imena = name.trim().split(" ");
        return imena.length == 3;
    }
}

