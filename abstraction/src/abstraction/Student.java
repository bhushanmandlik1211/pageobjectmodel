package abstraction;

public class Student extends Velocity {
	
	public void a()
	{
		System.out.println("this is incomplete method in method a");
	}
	
	public void b()
	{
		System.out.println("this is incomplete method in method b");
	}


	public static void main(String[] args) {

		Velocity cc= new Student();
		cc.a();
		cc.b();
		cc.c();
		}

}
