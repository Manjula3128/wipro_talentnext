package arraya;

import java.util.Arrays;

public class array5 {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56, 3, 67};
        Arrays.sort(numbers);
        int smallest1 = numbers[0];
        int smallest2 = numbers[1];
        int largest1 = numbers[numbers.length - 1];
        int largest2 = numbers[numbers.length - 2];
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
    }
}
