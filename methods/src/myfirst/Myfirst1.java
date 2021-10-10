package myfirst;

public class Myfirst1 {
	
public void myfirst11() {//non static method
	System.out.println("good mrning");
}
public static void main(String[] args) {
	
	Myfirst1 mf1 = new Myfirst1();// object creation for calling non static method
	mf1.myfirst11();//non static method call
	System.out.println("to all");
}
}
