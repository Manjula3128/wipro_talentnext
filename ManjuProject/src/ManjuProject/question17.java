package ManjuProject;
import java.util.*;
public class question17 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int original = number;
	        int reversed = 0;

	        // Reverse the number
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number = number / 10;
	        }

	        // Check if reversed is equal to original
	        if (original == reversed) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }

	        sc.close();// TODO Auto-generated method stub

	}

}