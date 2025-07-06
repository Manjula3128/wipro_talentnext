package arraya;
import java.util.*;
public class array8 {

	public static void main(String[] args) {
		int[] numbers = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean skip = false;

        for (int num : numbers) {
            if (num == 6) {
                skip = true;
            } else if (num == 7 && skip) {
                skip = false;
                continue;  
            }

            if (!skip) {
                sum += num;
            }
        }

        System.out.println("Sum = " + sum);// TODO Auto-generated method stub

	}

}