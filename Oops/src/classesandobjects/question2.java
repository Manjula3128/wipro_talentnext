package classesandobjects;
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		String res="";
		int min=Math.min(s.length(),s1.length());
		for(int i=0;i<min;i++) {
			res+=""+s.charAt(i)+s1.charAt(i);
		}
		if(s.length()>min) {
			res+=s.substring(min);
		}
		if(s1.length()>min) {
			res+=s1.substring(min);
		}
		System.out.print(res);

	}

}