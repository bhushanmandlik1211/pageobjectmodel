package variabletypes;

public class Variabletypes {
public static void run() {
	int i=3456;                          //local variable
	System.out.println(i);
}
	public void test() {
		char c='j';						//local variable
		System.out.println(c);
	}
	public static void main(String[] args) {
	run();
	Variabletypes v= new Variabletypes();
	v.test();
	}

}
 