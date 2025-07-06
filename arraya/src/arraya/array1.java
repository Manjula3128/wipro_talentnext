package arraya;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        
        // Loop through each element and add to sum
        for (int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Print the results
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}