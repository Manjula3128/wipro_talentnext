package ManjuProject;
import java.util.*;
public class question13 {
	public static void main(String[] args) {
	System.out.println("Prime numbers between 10 and 99 are:");

    for (int num = 10; num <= 99; num++) {
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num);
        }
    }
}
}