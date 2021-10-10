package primitive_Casting;

public class Implicit_Widening_Automatic_Casting {

	public static void main(String[] args) {
		
		byte a=111;
		short b=a;
		System.out.println("byte to short "+b);
		
		short c=123;
		int d=c;
		System.out.println("short to int "+d);
		
		int e=12345;
		long f=e;
		System.out.println("int to long "+f);
		
		long g=1213456789;
		float h=g;
		System.out.println("long to float "+h);
		
		float i=73.8f;
		double j=i;
		System.out.println("float to double "+j);
	}

}
