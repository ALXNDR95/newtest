package Modul4;  /* Задача 2
Исправьте ошибку в шаблоне регулярного выражения. Код должен выводить все слова, начинающиеся на букву «с» без учёта регистра.*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMatcher {
    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами";
        /*Pattern pattern = Pattern.compile("\\b[Сс]\\w+\\b");*/    //вариант с ошибкой
        Pattern pattern = Pattern.compile("\\b[Сс][а-я]+\\b");   // или ("\\b[Сс][А-я]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
