package Modul2;

public class UnitSwitch {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';
        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {

        String decode = "";
        switch (ch) {
            case 'h':
                decode = "Hello!";
                break;
            case 'i':
            case 'm':
            case 'k':
                decode = "I can decode!";
                break;
            case 'b':
                decode = "Bye!";
                break;
            default:
                decode = "I don’t know these symbols:(";
        }
        return decode;
    }
}

