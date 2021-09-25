package Modul3;                     //конструкторы и методы SrtingBuilder

public class StringBuilderConstructor {
    public static void main(String[] args) {
        // StringBuilder has three constructors
        StringBuilder emptyConstructor = new StringBuilder();      //пустой конструктор
        StringBuilder stringSpecified = new StringBuilder("Here is a string to start"); //возможность указать String
        StringBuilder lengthSpecified = new StringBuilder(10);  //который принимает int для определения длины

        // insert method - метод вставки
        emptyConstructor.insert(0, "adding to the empty StringBuilder");
        System.out.println(emptyConstructor);

        // replace method - метод замены
        stringSpecified.replace(0, 4, "There");
        System.out.println(stringSpecified);

        // length method - метод длины
        System.out.println(lengthSpecified.length());
    }
}

