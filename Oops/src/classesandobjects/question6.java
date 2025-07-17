package classesandobjects;
import java.util.*;
public class question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringJoiner s1=new StringJoiner("-");
		StringJoiner s2=new StringJoiner("-");
		int n1=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n1;i++) {
			s1.add(sc.next());
		}
		int n2=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n2;i++) {
			s2.add(sc.next());
		}
		StringJoiner s1merged=new StringJoiner("-");
		s1merged.merge(s1);
		s1merged.merge(s2);
		System.out.print(s1merged);
		System.out.println();
		StringJoiner s2merged=new StringJoiner("-");
		s2merged.merge(s2);
		s2merged.merge(s1);
		System.out.print(s2merged);
		

	}

}