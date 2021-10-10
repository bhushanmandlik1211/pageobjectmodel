package generalization;

public class Dog extends Animal {
	
		public void dogSound()
		{
			System.out.println("bow bow");
		}

	public static void main(String[] args) {
		
		Animal a= new Dog();
		a.eating();

	}

}
