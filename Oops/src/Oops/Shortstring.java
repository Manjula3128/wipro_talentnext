package Oops;
import java.util.*;
public class Shortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String c=sc.nextLine();
		String res=ShortLong(a,c);
		System.out.print(res);
	}
	public static String  ShortLong(String a,String b) {
		if(a.length()<b.length()) {
			return a+b+a;
		}
		else {
			return b+a+b;
		}
	}

}