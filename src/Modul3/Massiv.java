package Modul3;  // программа, в которой содержится массив, заполненный элементами от 5 до 15, печать всех элементов массива

/*public class Massiv {
    public static void main(String[] args) {
            int[] array = new int[11]; // сейчас array содержит одни нули
            int nums = 5; // первое значение для массива array
            for (int i = 0; i < array.length; i++) { // обходим весь массив, начиная с 0-го индекса
                array[i] = nums; // присваиваем ячейке значения nums
                nums++; // увеличиваем nums на 1 каждый раз (5, 6, 7, ..., 15)
            }
            for (int item : array) { // равносильно (int i = 0; i < array.length; i++)
                System.out.println(item); //печатаем элемент массива
            }
        }
    }*/

/*public class Massiv {
    public static void main(String[] args) {
        int[] array = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
        int[] copy = array;
        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i] * 2;
        }
    }
}*/

/*class Main {
    public static void main(String[] args) {
        String a = "Kaznit'";
        String b = " nelzya";
        String d = ",";
        String c = " pomilovat'!";

        System.out.println(a + b + d + c);
    }
}*/
/*class Main {
    public static void main(String[] args) {
        String b = "Велосипедист";
        System.out.println(b.charAt(8));
    }
}*/

/*class Main {
    public static void main(String[] args) {
        /*String a = "Sometimes";
        System.out.println("Sometimes".charAt(2));
    }
        String a = "Иван Иванов";
        String b = "иван иванов";

        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.equals(b));
    }
}*/
/*public class Massiv {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        checkUserName(user1, user2);
    }

   private static void checkUserName(String user1, String user2) {
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
}*/

/*public class Massiv {
    public static void main(String[] args) {
        String user1 = "иван иванов";
        String user2 = "Иван Иванов";
        checkUserName(user1, user2);
    }

    private static void checkUserName(String user1, String user2) {
        if (user1.equalsIgnoreCase(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
    }
}*/

/*public class Massiv {
    public static void main(String[] args) {
        String user1 = "Anna Denisova";
        String user2 = "Alexandra Dolgova";
        checkUserName(user1, user2);
        user1.length();
    }

    private static void checkUserName(String user1, String user2) {
        if (user1.equals(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
    }
}*/

/*public class Massiv {
    public static void main(String[] args) {
        String user1 = "Anna Denisova";
        String user2 = "Alexandra Dolgova";
        checkUserName(user1, user2);
        user1.length();
    }

    private static void checkUserName(String user1, String user2) {
        String user2copy = user2.replace(" ","");
        if (user1.equals(user2) == true)
            System.out.println("Выберите другое имя пользователя");
        else
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
            System.out.println("А без пробелов ваше имя имеет длину " + user2copy.length() + " символов");
    }
}*/