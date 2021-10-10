package non_Primitive_Casting;

public class ChildClass extends ParentClass {

	int a = 30;
	static int b = 40;
	
	ChildClass(){
		System.out.println("Inside ChildClass Constructor.");		
	}
	
	void methodExample() {
		System.out.println("Inside Child Class Instance Method.");
	}
	
	static void staticMethodExample() {
		System.out.println("Inside Child Class Static Method.");
	}
	
	

}
