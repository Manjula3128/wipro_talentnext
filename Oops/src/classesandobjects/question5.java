package classesandobjects;
import java.util.*;
public class question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			names.add(sc.nextLine());
		}
		StringJoiner a=new StringJoiner(",","{","}");
		for(String s:names) {
			a.add(s);
		}
		System.out.println(a.toString());
		

	}

}