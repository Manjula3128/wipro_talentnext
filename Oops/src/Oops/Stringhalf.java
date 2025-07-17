package Oops;
import java.util.*;
public class Stringhalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String res="";
		if(n.length()%2==0) {
			 res=n.substring(0,n.length()/2);
		}
		else {
			System.out.print("null");
		}
		System.out.print(res);

	}

}