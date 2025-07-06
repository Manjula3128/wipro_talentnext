package arraya;
import java.util.*;
public class array6 {
	public static void main(String[] args) {
		int[] numbers = {45, 12, 89, 34, 7, 56};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }


	}

}