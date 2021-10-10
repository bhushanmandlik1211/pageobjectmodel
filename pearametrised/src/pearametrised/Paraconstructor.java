package pearametrised;

public class Paraconstructor {

	
	int empid;							//<---global variable/instance variable
String empname;							//<---global variable/instance variable
	int empyear;

Paraconstructor(int id,String name){	//<---parameterised constuctor
    empid=id;
	empname=name;
	System.out.println(empid);
	System.out.println(empname);
	}

Paraconstructor(){						//<---zero constructor
	empid=79;
	empname="bhuvi";
	  System.out.println("this is my zero constructor");	
      System.out.println(empid);
		System.out.println(empname);
		}

Paraconstructor(int year){   //<---parameterised constuctor
	empyear=year;
	  System.out.println("Employee year");
	System.out.println(empyear);}
	public static void main(String[] args) {
		
			
		new Paraconstructor(143,"bhushan");
		
		
		new Paraconstructor();
      
		
		new Paraconstructor(2020);
	
	
	}
}
