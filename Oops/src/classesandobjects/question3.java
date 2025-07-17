package classesandobjects;
import java.util.*;
public class question3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String s1="";
	int n=sc.nextInt();
	if(n<s.length()) {
	s1+=s.substring(s.length()-n);
	
	for(int i=0;i<n;i++) {
		System.out.print(s1);
	}
	}
	
}
}