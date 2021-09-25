package Modul4;

public class TankConstant {

    static final String MODEL = "T34";   // static variable (constanta)
    static int ntanks;                   // static field, which increase in constructor

    private int x, y;
    private int dir;
    private int fuel;
    private int n;

    public TankConstant() {
        this(0, 0, 100);
    }

    public TankConstant(int x, int y) {
        this(x, y, 100);
    }

    public TankConstant(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ntanks;
    }

    public void goForward(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
    }

    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + n + " is at " + x + ", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public static void main(String[] args) {
        // В (0;0) с fuel = 100
        TankConstant justTank = new TankConstant();
        // В (10;20) с fuel = 100
        TankConstant anywareTank = new TankConstant(10, 10);
        // В (20;30) с fuel = 200
        TankConstant customTank = new TankConstant(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}

