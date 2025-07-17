package Oops;
import java.util.*;
public class ConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine().toLowerCase();
		String b=sc.nextLine().toLowerCase();
		String res;
		 String r=a.replaceAll("[^a-z]", "");
		 String sum=b.replaceAll("[^a-z]", "");
		if(r.charAt(r.length()-1)==sum.charAt(0)) {
			res=r+sum.substring(1);
		}
		else {
			res=r+sum;
		}
		System.out.print(res+" ");

	}

}