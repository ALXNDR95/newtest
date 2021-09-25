package Modul4;       //Добавьте в класс поле int fuel. Топливо должно уменьшаться на единицы пройденного расстояния, и Танк должен проезжать не больше единиц расстояния, чем остаток топлива. Добавьте в класс конструкторы так, чтобы можно было создавать танк разными способами.

public class TankSFFuel {
    int x, y;
    int dir;
    int fuel;

    public TankSFFuel() {
        this(0, 0, 100);
    }

    public TankSFFuel(int x, int y) {
        this(x, y, 100);
    }

    public TankSFFuel(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public void goForward(int i) {
        if (i < 0 && -i > fuel)
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
        System.out.println("The Tank is at " + x +", " + y + " now.");
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
/*
Make (add code to class Tank),
with fuel and different constructors
*/

        // At (0;0) fuel=100
        TankSFFuel justTank = new TankSFFuel();
        // At (10;20) fuel=100
        TankSFFuel anywareTank = new TankSFFuel(10, 10);
        // At (20;30) fuel=200
        TankSFFuel customTank = new TankSFFuel(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

/*
This fragment of code has to output

The Tank is at 100, 0 now.
The Tank is at 110, 10 now.
The Tank is at 220, 30 now.

*/
    }
}
