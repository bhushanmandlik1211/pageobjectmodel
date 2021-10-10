package methodcalling;

public class MethodCallWithinClass {

	public void first() {
		System.out.println("this is my non static method 1st");
	}
	public void second() {
		System.out.println("this is my non static method 2nd");
	}
	public static void third() {
		System.out.println("this is my static method 1st");
	}
	public static void fourth() {
		System.out.println("this is my static method 2nd");
	}
	public static void run() {
		System.out.println("static method call in different class");
	}

	public static void main(String[] args) {
		MethodCallWithinClass md=new MethodCallWithinClass();
		md.first();
		md.second();
		third();
		fourth();
	}

}
