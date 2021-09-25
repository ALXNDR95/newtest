package Modul4;

public class Tank {
    /*static String type;*/
    int distance;

    public Tank(/*String type,*/ int distance) {
        /* this.type = type;*/
        this.distance = distance;
    }

    /* void goForward1(int distanceIncrease1) {
         System.out.println("The tank distance increases by " + distanceIncrease1);
         distance += distanceIncrease1;
         System.out.println("The tank distance is " + distance + " now.");
     }

     void printPosition() {
     }

     void goForward2(int distanceIncrease2) {
         System.out.println("The tank distance increases by " + distanceIncrease2);
         distance += distanceIncrease2;
         System.out.println("The tank distance is " + distance + " now.");
     }

     void goBackward(int distanceDecrease) {
         System.out.println("The tank distance decreases by " + distanceDecrease);
         distance -= distanceDecrease;
         System.out.println("The tank distance is " + distance + " now.");
     }

     static class TankTest {
         public static void main(String[] args) {
             Tank tank = new Tank("T-34", 0);
             tank.goForward1(10);
             tank.printPosition();
             tank.goForward2(50);
             tank.printPosition();
             tank.goBackward(100);
             tank.printPosition();
         }
     }*/
    void goForward(int distanceIncrease1, int distanceIncrease2) {
        this.distance += distanceIncrease1;
        System.out.println("The Tank is at " + distance + " now.");
        this.distance += distanceIncrease2;
        System.out.println("The Tank is at " + distance + " now.");
    }

    void printPosition() {
    }

    void goBackward(int distanceDecrease) {
        this.distance -= distanceDecrease;
        System.out.println("The Tank is at " + distance + " now.");
    }

    static class TankTest {
        public static void main(String[] args) {
            Tank tank = new Tank(0);
            tank.goForward(10, 50);
            tank.printPosition();
            tank.goBackward(100);
            tank.printPosition();
        }
    }
}