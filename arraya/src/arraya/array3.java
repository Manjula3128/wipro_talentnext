package arraya;
import java.util.*;
public class array3 {

	public static void main(String[] args) {
		int[] numbers = {1, 4, 34, 56, 7};

        // Element to search
        int searchElement = 90;

        // Flag to store index if found
        int index = -1;

        // Loop to find the index
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                index = i;
                break;
            }
        }

        // Print the result
        System.out.println(index);// TODO Auto-generated method stub

	}

}