package Oops;

class Bird extends Animal{
	@Override
	public void eat() {
		System.out.println("Bird eating");
	}
	public void sleep() {
		System.out.println("Bird sleeping");
	}
	public void fly() {
		System.out.println("Bird Flying");
	}	
}