package Oops;

public class Employee extends Person{
	private double annualsalary;
	private int year;
	private String insuranceNumber;
	public Employee(String name,double annualsalary,int year,String insuranceNumber) {
		super(name);
		this.annualsalary=annualsalary;
		this.year=year;
		this.insuranceNumber=insuranceNumber;
	}
	public double getannualsalary() {
		return annualsalary;
	}
	public int getyear() {
		return year;
	}
	public String getinsuranceNumber() {
		return insuranceNumber;
	}
	public void setName(double annualsalary) {
		this.annualsalary=annualsalary;
	}
	public void setName(int year) {
		this.year=year;
	}
	public void setName(String insuranceNumber) {
		this.insuranceNumber=insuranceNumber;
	}
}