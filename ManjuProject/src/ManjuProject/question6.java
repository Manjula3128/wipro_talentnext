package ManjuProject;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); // Prompt the user
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
