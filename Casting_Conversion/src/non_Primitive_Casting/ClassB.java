package non_Primitive_Casting;

public class ClassB extends ClassA {

	public void classB() 
	{
	System.out.println("this is from class B");	
	}
	public static void main(String[] args) {
		System.out.println("Upcasting");
		ClassA u=new ClassB();
		u.classA();
		System.out.println("********************************************************************");
		System.out.println("after Downcasting");
		ClassB d=(ClassB)u;
		d.classA();
		d.classB();
	}
}
