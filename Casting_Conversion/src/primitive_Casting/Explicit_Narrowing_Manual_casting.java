package primitive_Casting;

public class Explicit_Narrowing_Manual_casting {

	public static void main(String[] args) {

		double a=23.45653544664;
		float b=(float)a;
		System.out.println("double to float "+b);
		
		float c=10.23f;
		long d=(long)c;
		System.out.println("float to long "+d);
		
		long e =122345678;
		int f=(int)e;
		System.out.println("long to int "+f);
		
		int g=3446373;
		short h=(short)g;
		System.out.println("int to short "+h);
		
		short i=11;
		byte j=(byte)i;
		System.out.println("short to byte "+j);
	}

}
