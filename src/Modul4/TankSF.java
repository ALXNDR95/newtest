package Modul4;

public class TankSF {
    int x;

    public void goForward(int i) {
        x += i;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
class Main {
    public static void main(String[] args) {
        TankSF tank = new TankSF();
        tank.goForward(0);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
}