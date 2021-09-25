package Modul3.Zadachi;   // программа, в которой пользователя просят ввести имя и пароль. Пароль должен быть ограничен по размеру от 8 до 15 символов. В случае ввода неверного пароля программа должна запрашивать пароль снова и выводить на экран причину ошибки.

import java.util.Scanner;

public class Vtoraya { /*public class Password {*/
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя пользователя:");
            String name = sc.nextLine();
            System.out.println("Создайте пароль:");
            String password = sc.nextLine();
            if (password.length() < 8 || password.length() > 15) {
                do {
                    System.out.println("Длина пароля должна составлять от 8 до 15 символов");
                    password = sc.nextLine();
                } while (password.length() < 8 || password.length() > 15);
            }
            System.out.printf("%s, Ваш новый пароль: %s", name, password);
        }
    }

