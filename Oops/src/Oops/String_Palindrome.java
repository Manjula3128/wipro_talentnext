package Oops;
import java.util.*;
public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String res=a;
		String str="";
		for(int i=a.length()-1;i>=0;i--) {
			str=str+a.charAt(i);
		}
		if(res.equals(str)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}

	}

}