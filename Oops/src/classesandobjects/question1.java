package classesandobjects;
import java.util.*;
public class question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				count=i;
			}
		}
		if(count != 0) {
			if(count  >0) {
				s1+=s.substring(0,count-1);
			}
			if(count+2<s.length()) {
				s1+=s.substring(count+2);
			}
			System.out.print(s1);
		}
		else {
			System.out.print(s);
		}

	}

}