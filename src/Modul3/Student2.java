package Modul3;

class Student2 {
    public static void main(String[] args) {

        Modul3.Student st1 = new Modul3.Student(34);
        Modul3.Student st2 = new Modul3.Student("Dovlatov");
        //Modul3.Student st3 = new Modul3.Student (600.20);

        System.out.println(st1.ID);
        System.out.println(st2.surname);
        //System.out.println(st3.grants);

        st1.getId();
        st2.getSurname();
        // emp3.getGrants();
    }
}

