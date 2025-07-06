package arraya;
import java.util.*;

public class array10 {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 1};

        int[] result = evenOdd(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        return result; 
    }
}
