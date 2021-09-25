package Modul4;   // split - разбиение большой строки на подстроки

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        String str = "EducationUSA is a U.S. Department of State network of over 430 international student advising centers " +
                "in more than 175 countries and territories. " +
                "The network promotes U.S. higher education to students around the world by offering accurate, comprehensive, " +
                "and current information about opportunities to study at accredited postsecondary institutions in the United States." +
                "EducationUSA also provides services to the U.S. higher education community to help institutional leaders meet their " +
                "recruitment and campus internationalization goals. EducationUSA is your official source on U.S. higher education. ";

        String[] array = str.split("\\s*U.S.\\s*");    // найти все предложения до фразы "U.S." и разделить их*/
        /*String[] array = str.split("[.,]");*/
        for (String temp : array) {
            System.out.println(temp);

        /*Scanner sc2  = new Scanner(str){
            while(sc2.hasNext()){
            if (sc2.hasNext("EducationUSA")) {
                    System.out.println(sc2.next());
                } else if (sc2.hasNextInt()) {
                    System.out.println(sc2.nextInt());
                } else {
                    sc2.next();
                }
            }
        };*/

        }

    }
}
