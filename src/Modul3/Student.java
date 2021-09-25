package Modul3;

public class Student {

    private double grants;
    public String surname;
    int ID;

    Student(int id2) {
        ID = id2;
    }

    public Student(String surname2) {
        surname = surname2;
    }

    private Student(double grants2) {
        grants = grants2;
    }

    public void getId() {
        System.out.println("ID = " + ID);
    }

    public void getSurname() {
        System.out.println("Surname = " + surname);
    }

    public void getGrants() {
        System.out.println("Grants = " + grants);
    }
}
