package Modul3.Zadachi; // В классе дана строка. Выведите в столбик ее подстроки так, чтобы каждую итерацию пропадали первый и последний ее символы. Выводите до тех пор, пока не останется 1 или 2 символа. Пример для строки "helloworld":

      /*helloworld
        elloworl
        llowor
        lowo
        ow*/

public class Desyataya {
    public static String string = "";

    public static void main(String[] args) {
        System.out.println(string);

        while (string.length() > 2) {
            string = string.substring(1, string.length() - 1);
            System.out.println(string);
        }
    }
}

