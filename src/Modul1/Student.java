package Modul1;

public class Student {
    public static int add(int x, int y) {
        int add = x + y;
        return add;
    }
    public static class StudentTest {
        public static void main(String[] args) {
            int value = add(3, 4);
            int result = add(value, 10);
            System.out.println(result);
        }
    }
}