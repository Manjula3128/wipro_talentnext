package arraya;
import java.util.*;
public class array7 {
	public static void main(String[] args) {
		int[] numbers = {12, 34, 12, 45, 67, 89,};
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int num : numbers) {
            uniqueSet.add(num);
        }
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }

	}

}