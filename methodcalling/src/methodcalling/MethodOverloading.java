package methodcalling;
//method call within class with parameters
public class MethodOverloading {

	public void demo() {
		System.out.println("this is my non static method1");
	}
	
	public void demo(int a) {
		System.out.println("this is my non static method2"+a);
	}
	
	public static void demo1() {
		System.out.println("this is my static method1");
	}
	
	public static void demo1(String a) {
		System.out.println("this is my static method2"  +a);
	}
	
	public static void main(String[] args) {
		MethodOverloading md=new MethodOverloading();
		md.demo();
		md.demo(500);
		MethodOverloading.demo1();
		MethodOverloading.demo1("bhushan");
	}
}
