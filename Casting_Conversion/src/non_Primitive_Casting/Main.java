package non_Primitive_Casting;

public class Main {

	public static void main(String[] args) {

		ParentClass objOne = new ParentClass();	  //ParentClass Reference and ParentClass Object
		
		System.out.println(objOne.a);
		System.out.println(objOne.b);
		objOne.methodExample();
		objOne.staticMethodExample();
		
		
	System.out.println("-----------------------------------------------------");
		
	ParentClass objTwo = new ChildClass();  //ParentClass Reference and ChildClass Object
	
	System.out.println(objTwo.a);
	System.out.println(objTwo.b);
	objTwo.methodExample();
	objTwo.staticMethodExample();
	
	
	}


	}
