package inheritance;

public class HI2 extends HI{

	public void grandchild() {
		System.out.println("This is from grandchild");
	}
	public static void main(String[] args) {
		HI2 hh=new HI2();
		hh.parent();
		hh.grandchild();

	}

}
