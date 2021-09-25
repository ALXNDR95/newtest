package Modul2;/*package Modul2;
public class Solution2 {
    public void max(int a, int b, int c, int d)  {
            int max1 = a > b ? a : b;
            int max2 = c > d ? c : d;
            int max = max1 > max2 ? max1 : max2;
            System.out.println(max);
        }
    }*/

public class Solution2 {
    public void checkDay(int number) {
        switch (number) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println();
        }
    }
}

