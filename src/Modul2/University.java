package Modul2;

public class University {
    public String name;
    public int accreditation;
    public String territory;

    public University(String name, int accreditation, String territory) {
        this.name = name;
        this.accreditation = accreditation;
        this.territory = territory;
    }

    private static void method1(University unt1, University unt2) {
        if (unt1.name.equals(unt2.name)) {     // 1-й if и 3-й else = пара
            if (unt1.accreditation == unt2.accreditation) {  // 2-й if и 2-й else = пара
                if (unt1.territory == unt2.territory) { // 3-й if и 1-й сначала else = пара
                    System.out.println("Universities’ names, accreditation and territories are similar");
                } else {
                    System.out.println("Universities’ names and accreditation are similar, but territories aren’t");
                }
            } else {
                System.out.println("Universities’ names are similar, but accreditation aren’t");
            }
        } else {
            System.out.println("Universities’ names are different");
        }
    }
    private static void method2(University unt1, University unt2) {
        if (unt1.name.equals(unt2.name) && unt1.accreditation != unt2.accreditation && unt1.territory == unt2.territory) {
        } else {
            System.out.println("Universities are different");
        }
    }
    public static void main(String[] args) {
        University unt1 = new University("Kyoto", 2, "Japan");
        University unt2 = new University("Princeton", 1, "USA");
        method1(unt1, unt2);
        method2(unt1, unt2);
    }
}



