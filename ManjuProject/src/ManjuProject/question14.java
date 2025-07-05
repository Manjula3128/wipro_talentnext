package ManjuProject;
import java.util.*;
public class question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Get last digit
            sum += digit;            // Add digit to sum
            number = number / 10;    // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();// TODO Auto-generated method stub

	}

}