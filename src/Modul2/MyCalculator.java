/*package Modul2;

import java.util.Scanner;

class myCalculator {

    public static void main(String[] args) {
        int operand1;
        int operand2;
        int operation;
        boolean result;
        Scanner scan = new Scanner(System.in);
        result = scan.nextBoolean();
        do {
            System.out.println("Availiable operations to perform:");
            System.out.println("Addition");
            System.out.println("Deduction");
            System.out.println("Multiplicatiion");
            System.out.println("Division");
            System.out.println("Please choose an operation to perform:");
            System.out.println("Choice of operation is: " + operation);
            operand1 = scan.nextInt();
            operand2 = scan.nextInt();

            switch(operation) {

                case 1:
                    int op1 = operand1 + operand2;
                    System.out.println("Please enter the numbers to be added:");
                    System.out.println("Addition:" + op1);
                    break;

                case 2:
                    int op2 = operand1 - operand2;
                    System.out.println("Please enter the numbers to be deducted:");
                    System.out.println("Deduction:" + op2);
                    break;

                case 3:
                    int op3 = operand1 * operand2;
                    System.out.println("Please enter the numbers to be multiplied:");
                    System.out.println("Multiplicatiion:" + op3);
                    break;

                case 4:
                    int op4 = operand1 / operand2;
                    if (operand2 == 0) {
                        System.out.println("Warning! Logic error!");
                    } else {
                        System.out.println("Please enter the numbers to be divided:");
                        System.out.println("Division:" + op4);
                        break;
                    }

                default:
                    System.out.println("Error! Please enter the correct combination.");
            }
        }while(result==true);
    }
}
*/




