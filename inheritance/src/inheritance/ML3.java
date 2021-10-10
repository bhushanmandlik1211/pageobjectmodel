package inheritance;

public class ML3 extends ML2{
	
	public void grandchild()
	{
		System.out.println("This is from grandchild");
	}

	public static void main(String[] args) {
	ML3 m=new ML3();
	m.parent();
	m.child();
	m.grandchild();

	}

}
