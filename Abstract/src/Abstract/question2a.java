
import test.foundation;

public class MainClass {
    public static void main(String[] args) {
        foundation obj = new foundation();
        obj.inputValues();  // User input
        obj.printInsideClass();  // Shows internal access to all variables

        System.out.println("\nAccessing from another class in a different package:");

      
        System.out.println("var4 = " + obj.var4);     // ✅ public - accessible
    }
}
