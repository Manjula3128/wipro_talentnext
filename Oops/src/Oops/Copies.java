package Oops;
import java.util.*;
public class Copies {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String res="";
		if(n.length()>=2) {
			res=" "+n.charAt(0)+n.charAt(1);
		}
		else {
			res=n;
		}
		System.out.print(res);
	}
}