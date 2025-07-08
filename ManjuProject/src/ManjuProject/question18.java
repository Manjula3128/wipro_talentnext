package ManjuProject;

import java.util.Scanner;

public class question18 {
	public static void main(String[] args) 
	{
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a > 0) {
			System.out.println("a is positive");
		} else if (a < 0) {
			System.out.println("a is negative");
		} else {
			System.out.println("a is zero");
		}
	
	}

}
