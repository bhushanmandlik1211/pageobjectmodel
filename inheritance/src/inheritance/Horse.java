package inheritance;

public class Horse extends Singleinheritance {
	
	public void eat()
	{
		System.out.println("this is child class");
	}

public static void main(String[] args) {
	
	Horse h=new Horse();
	h.eat();
	h.run();
}

}


