package Modul4;   //  Реализуйте повороты танка на 90°, чтобы он мог перемещаться по всей плоскости

public class TankSFTurn {

    int x,
            y;
    int dir;

    //мы считаем, что dir может принимать 4 значения
    //0 (значение по умолчанию) вправо
    //1  - вниз, 2  - влево, 3 - вверх
    public void goForward(int i) {
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }
    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
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
        goForward( - i);
    }

    public static void main(String[] args) {
/*
Make (add code to class Tank),
which can turn around
*/
        TankSFTurn tank = new TankSFTurn();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();

/*
This fragment of code has to output

The Tank is at 10, 0 now.
The Tank is at 10, 50 now.
The Tank is at -90, 50 now.

*/
    }

}

