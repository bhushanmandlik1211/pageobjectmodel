package inheritance;

public class HI1 extends HI {

	public void child() {
		System.out.println("This is from child");
	}
	public static void main(String[] args) {
		HI1 h=new HI1();
		h.parent();
		h.child();
		

	}

}
