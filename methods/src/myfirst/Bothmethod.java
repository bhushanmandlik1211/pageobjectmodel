package myfirst;

public class Bothmethod {
public static void first1() {//static method declaration
	System.out.println("static method is running");
}
public void second(){//non static method declaration
	System.out.println("non static method is running");
}
public static void main(String[] args) {// main method
	first1();//static method call
	Bothmethod BM=new Bothmethod();//object creation
	BM.second();//non static method call
}
}

