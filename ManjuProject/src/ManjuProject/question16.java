package ManjuProject;
import java.util.*;
public class question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversed = 0;

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10;        // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed
            number = number / 10;           // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();// TODO Auto-generated method stub

	}

}