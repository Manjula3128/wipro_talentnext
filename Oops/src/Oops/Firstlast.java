package Oops;
import java.util.*;
public class Firstlast {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		if(a.length()<=2) {
			System.out.print("");
		}
		String res=a.substring(1,a.length()-1);
       System.out.print(res);
	}

}