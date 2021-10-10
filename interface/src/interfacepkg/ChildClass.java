package interfacepkg;

public class ChildClass extends AbstaractionClass {

	public void b()
	{
		System.out.println(" i am b");
	}
	
	public void c()
	{
		System.out.println(" i am c");
	}
	
	public void d()
	{
		System.out.println(" i am d");
	}

	
	public static void main(String[] args) {

		InterfaceClass ac= new ChildClass();
		ac.a();
		ac.b();
		ac.c();
		ac.d();
	}

}
