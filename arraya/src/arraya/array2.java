package arraya;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		int[] numbers = {45, 12, 78, 34, 89, 23, 56};

        // Assume first element is both max and min
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array to find max and min
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Print the results
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);// TODO Auto-generated method stub

	}

}