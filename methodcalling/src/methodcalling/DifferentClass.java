package methodcalling;

public class DifferentClass {
	public void test() {
		System.out.println("method call in same class");
	}
public static void run() {
	System.out.println("static method call in same class");
}
	public static void main(String[] args) {
		
System.out.println("********Method calling from different class********");
MethodCallWithinClass md=new MethodCallWithinClass();
md.first();
md.second();
MethodCallWithinClass.third();
MethodCallWithinClass.fourth();
MethodCallWithinClass.run();

System.out.println("********method calling from same class********");
DifferentClass dc=new DifferentClass();
dc.test();
run();
	

	
	}

}
