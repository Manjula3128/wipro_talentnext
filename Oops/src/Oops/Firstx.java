package Oops;
import java.util.*;
public class Firstx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String res=XRemove(a);
		System.out.print(res);
	}
	String str="";
	public static String XRemove(String str) {
		if(str.startsWith("x")) {
			str=str.substring(1);
		}
		if(str.endsWith("x")) {
			str=str.substring(0,str.length()-1);
	}
		return str;
	}
}