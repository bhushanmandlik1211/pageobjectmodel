package polymorphism;

public class Overiding2 extends Overiding1{
	
	public void run()
	{
		//super.run();
		System.out.println("good night");
	}

	public static void main(String[] args) {
		
		Overiding2 o=new Overiding2();
		o.run();
		

	}

}
