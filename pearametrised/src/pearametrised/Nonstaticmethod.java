package pearametrised;
// write a program for parametrised constructor and zero constructoer with non static method

public class Nonstaticmethod {
	int empno;										//global/instance variable declaration
	String empname;									//global/instance variable declaration
//1] from above questin parameterised constructor
Nonstaticmethod(int id,String name){				//parameterised costructor declaration
		empno=id;
		empname=name;
		System.out.println(empno+" "+empname);
}	
//2] from above question zero constructor
Nonstaticmethod(){									//zero constructor declartion
	empno=7979;
	empname="Bhushan";
	System.out.println(empno+" "+empname);
}
//3]from above question non static method
public void print() {								//non static method declaration
	System.out.println("this is my nonstatic method:-");
	System.out.println("Emplyee Id:"+empno+"Employee Name:"+empname);
}
public void print1() {								//non static method declaration
	System.out.println("this is my nonstatic method:-");
	System.out.println("Emplyee Id:"+empno+"Employee Name:"+empname);
}
public static void main(String[] args) {
	
	//new Nonstaticmethod(1705,"Mandlik");
    //new Nonstaticmethod();
	
Nonstaticmethod m= new Nonstaticmethod(1705,"Mandlik");
m.print1();    
		Nonstaticmethod o= new Nonstaticmethod();
		 o.print1();
	}

}
