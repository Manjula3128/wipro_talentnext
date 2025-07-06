package arraya;
import java.util.*;
public class array9 {
	public static void main(String[] args) {
	 int[] arr = {1, 10, 10, 2};

     int[] result = withoutTen(arr);
     System.out.println("Result: " + Arrays.toString(result));
 }

 public static int[] withoutTen(int[] nums) {
     int[] result = new int[nums.length];
     int index = 0;
     for (int num : nums) {
         if (num != 10) {
             result[index] = num;
             index++;
         }
     }
     return result;
}
}