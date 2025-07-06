package arraya;
import java.util.*;
public class array11 {

	public static void main(String[] args) {
		 int[] nums = {1, 4, 1, 4, };

	        boolean hasOne = false;
	        boolean hasFour = false;
	        for (int num : nums) {
	            if (num == 1) {
	                hasOne = true;
	            }
	            if (num == 4) {
	                hasFour = true;
	            }
	        }
	        System.out.println(hasOne && hasFour);// TODO Auto-generated method stub

	}

}