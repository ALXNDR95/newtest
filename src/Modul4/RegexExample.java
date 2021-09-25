package Modul4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class RegexExample {
        public static void main(String[] args) {
            String regex = "((\\w{5,})@(\\w+\\.)([a-z]{2,4})|(\\w{7,})@([a-z]{2}))";
            String str = "Email options are everyone@gmail.com, someone@ru!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println("Email option: " + matcher.group());
                System.out.println("branch");
            }
        }
    }

