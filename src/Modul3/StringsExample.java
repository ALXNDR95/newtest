package Modul3;

public class StringsExample {
    public static void main(String[] args) {
        String str = "asds";
        String str2 = new String ("asds");
        String str3 = "asds";
        str2 = str2.intern();    // метод, перемещающий значения в String пул и образующий ссылку
        StringBuilder str4 = new StringBuilder("ads");
        str4.append("gdf");
        str += "asd";

        System.out.println(str == str2);   // сравниваются ссылки
        System.out.println(str.equals(str2));  // сравниваются значения
        System.out.println(str == str3);   // сравниваются ссылки

    }
}
