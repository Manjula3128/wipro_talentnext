package Oops;
import java.util.Scanner;

class Cal {

    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer base and exponent: ");
        int intBase = sc.nextInt();
        int intExp = sc.nextInt();
        int intResult = powerInt(intBase, intExp);
        System.out.println("Integer power result: " + intResult);

        System.out.print("Enter double base and exponent: ");
        double doubleBase = sc.nextDouble();
        int doubleExp = sc.nextInt();
        double doubleResult = powerDouble(doubleBase, doubleExp);
        System.out.println("Double power result: " + doubleResult);
    }
}
