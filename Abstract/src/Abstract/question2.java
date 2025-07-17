// Save this in: test/foundation.java
package Abstract;

import java.util.Scanner;

public class question2 {
    private int var1;       // private
    int var2;               // default
    protected int var3;     // protected
    public int var4;        // public

    public void inputValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for var1 (private): ");
        var1 = sc.nextInt();
        System.out.print("Enter value for var2 (default): ");
        var2 = sc.nextInt();
        System.out.print("Enter value for var3 (protected): ");
        var3 = sc.nextInt();
        System.out.print("Enter value for var4 (public): ");
        var4 = sc.nextInt();
    }

    public void printInsideClass() {
        System.out.println("Inside 'foundation' class:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
    }
}
