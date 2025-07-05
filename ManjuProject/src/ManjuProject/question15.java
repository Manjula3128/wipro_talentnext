package ManjuProject;
import java.util.*;

public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ Corrected Scanner

        // Ask user for input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Print Floyd's Triangle using for loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

        sc.close();
    }
}