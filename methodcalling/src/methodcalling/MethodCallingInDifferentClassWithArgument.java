package methodcalling;

public class MethodCallingInDifferentClassWithArgument {

	public void duplicate(int a) {
		System.out.println("my name is bhushan"+" "+a);
	}

	public void duplicate( String z ,int b) {
		System.out.println("good morning"+" "+z+b);
	}
	
	public static void duplicate(int c, String x,int d) {
		System.out.println("good afternoon"+" "+c+x+d);
	}
	
	public static void duplicate(int e,int f) {
		System.out.println("good night"+" "+e+" "+f);
	}
	
	
}
