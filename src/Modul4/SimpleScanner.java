package Modul4;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        String str = "1 builder 3 builder   5 builder              7 builder";
        Scanner sc = new Scanner(str).useDelimiter("\\s*builder\\s*");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
    }
}

