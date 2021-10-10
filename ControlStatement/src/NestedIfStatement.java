
public class NestedIfStatement {

	public static void main(String[] args) {
		
		int a=10;
		if(a<40) {
			System.out.println("fail");

			if(a>9) {
				System.out.println("pass");
			}
		}
	}

}
