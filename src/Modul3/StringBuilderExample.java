package Modul3;                  //использование метода Append

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder skiResort = new StringBuilder("Big Sky");
        System.out.println(skiResort);

        // Appending a string
        skiResort.append(" Montana");
        System.out.println(skiResort);

        // Append char array
        char[] hasCharArray = new char[]{' ', 'h', 'a', 's', ' '};
        skiResort.append(hasCharArray);
        System.out.println(skiResort);

        // Append an int
        skiResort.append(12);
        System.out.println(skiResort);

        // Appending another string
        skiResort.append(" lifts.");
        System.out.println(skiResort);

    }
}

