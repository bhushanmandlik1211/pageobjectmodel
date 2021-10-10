package variabletypes;

public class Staticvariable {
static char c='b';       //static variable
public void run() {
	System.out.println(c);
}
public static void test() {
	System.out.println(c);
}
	public static void main(String[] args) {
		
		Staticvariable sv=new Staticvariable();
		sv.run();
		test();
	}

}
