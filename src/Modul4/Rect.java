package Modul4;

public class Rect {
    private int s;
    int w, h;

    Rect(int w, int h) {
        this.w = w;
        this.h = h;
        s = w * h;
    }

    int getS() {
        return s;
    }

    int getW() {
        return w;
    }

    int getH() {
        return h;
    }

    public static void main(String[] args) {
       /* Rect r = new Rect(20, 30);
        r.w = 20;
        r.h = 30;
        System.out.println(r.s);*/
        Rect r = new Rect(20, 30);   //Площадь должна стать 30, а останется 600!
        r.w = 1;
        r.h = 30;
        System.out.println(r.s);
    }
}
