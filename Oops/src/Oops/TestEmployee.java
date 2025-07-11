package OSops;
import java.util.*;
public class TestEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double annualsalary=sc.nextDouble();
		int year=sc.nextInt();
		sc.nextLine();
		String insuranceNumber=sc.nextLine();
		Employee em=new Employee(name,annualsalary,year,insuranceNumber);
		System.out.println(em.getName());
		System.out.println(em.getannualsalary());
		System.out.println(em.getyear());
		System.out.println(em.getinsuranceNumber());

	}

}