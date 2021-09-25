package Modul3;          //конструкторы и методы StringBuffer

/*public class StringBufferConstructor {
        public static void main(String[] args) {
            // 3 different constructors
            StringBuffer emptySBCon = new StringBuffer();    // пустой
            StringBuffer setSizeCon = new StringBuffer(20);  // указание размера
            StringBuffer stringCon = new StringBuffer("Tom is Awesome");   // указание String для запуска
        }*/
class StringBufferMethods {
    public static void main(String[] args) {
        // the append method
        StringBuffer javaStringBuffer = new StringBuffer("Java is ");
        javaStringBuffer.append("Great!!");
        System.out.println(javaStringBuffer);

        // insert method
        javaStringBuffer.insert(15, " yes..");
        System.out.println(javaStringBuffer);

        // replace method
        javaStringBuffer.replace(13,15, "??");
        System.out.println(javaStringBuffer);

        // reverse method
        javaStringBuffer.reverse();
        System.out.println(javaStringBuffer);
    }
}