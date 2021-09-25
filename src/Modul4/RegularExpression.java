package Modul4;

/* Регулярное выражение (RegEx) — это, по сути, шаблоны из символов, которые задают определённое правило поиска. И, среди прочего, с их помощью возможно осуществить проверку определённой строки или строк на соответствие некоему заранее заданному паттерну или стандарту.
* в Java все классы, описывающие регулярные выражения, хранятся в пакете java.util.regex. Понадобятся два класса – Pattern (cоздание регулярки, объекта класса Pattern) и Matcher («искалка» этого паттерна, объект класса Matcher)
* для компиляции - использование метода compile() класса Pattern
*                                Pattern p = Pattern.compile("a*b"); // что ищем
                                 Matcher m = p.matcher("aaaaab"); // где ищем
* метод boolean find() ищет очередное совпадение в тексте с шаблоном
* методы int start() и int end() дают номера начал-концов совпадения
* помощью методов String replaceFirst(String replacement) и String replaceAll(String replacement) можно заменять в тексте совпадения на другой текст replacement. */

//описание примера построения кода с RegEx    https://habr.com/ru/post/267205/ !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
        public static void main(String[] args) {
            String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
            Pattern pattern = Pattern.compile("<strike>.*?</strike>");

            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
            }

            System.out.println("Clean the text");
            System.out.println(matcher.replaceAll(""));

            /*String text = "Иван Петров";
            Pattern pattern = Pattern.compile("(.*) (.*)");
            Matcher matcher = pattern.matcher(text);
            //меняем первую группу со второй
            System.out.println(matcher.replaceFirst("$2 $1"));*/

        }
    }

/*



/*=>  Pattern pattern = Pattern.compile(“([A-Za-z0-9]{1,}[\\-]{0,1}[A-Za-z0-9]{1,}[\\.]{0,1}[A-Za-z0-9]{1,})+@([A-Za-z0-9]{1,}[\\-]{0,1}[A-Za-z0-9]{1,}[\\.]{0,1}[A-Za-z0-9]{1,})+[\\.]{1}[a-z]{2,4}”);

Сократим с помощью:

 [\\.-]  - способ одновременного выражения наличия тире или точки в паттерне;
 \\w     - обозначение любой буквы или цифры. Т.е. он способен заменить описание типа [A-Za-z0-9];
 +       - наличие символа в количестве от одного до бесконечности;
 ?       - наличие символа не более одного раза;
 *       - наличие чего-либо в паттерне неопределённое количество раз, т.е. {0,};

В итоговом варианте мы имеем следующее:

Pattern pattern = Pattern.compile(“\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}”);

 */
