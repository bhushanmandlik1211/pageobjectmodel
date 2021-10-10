package constructor;

public class Demo {
	int rollno;
	String name;
	double d;
	 Demo(){
		rollno=111;
		String name="Bhushan";
		System.out.println(rollno+"    "+name);	
			 
	}
	Demo(String name){
		rollno=112;
		System.out.println(rollno+"    "+name);	
	}
	Demo(int rollno,String name){
		System.out.println(rollno+"    "+name);

}
	Demo(int rollno, String name,double d){
		System.out.println(rollno+"    "+name+"    "+d);	
}
	
	public static void main(String[] args) {
		
		System.out.println("STUDENTS INFORMATION OF 2021 ");
		
		System.out.println("Rollno"+" "+"Name"+" "+"Double");	

		new Demo();
		new Demo("Rohan");
		new Demo(113, "Manoj");
		new Demo(114, "Vijay",23.23);
	}

}
