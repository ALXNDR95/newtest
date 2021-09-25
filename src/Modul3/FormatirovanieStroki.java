package Modul3;

public class FormatirovanieStroki {
        public static void main(String[] args) {
            String name = "Zhenya";
            int age = 18;
            String status = "Kursant";

            String formatString = String.format("Poznakom'tes', eto %s, emu %d, on %s.", name, age, status);
            System.out.println(formatString);

            System.out.printf("Poznakom'tes', eto %s, emu %d, on %s.", name, age, status);
        }
    }

