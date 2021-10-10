package methodcalling;

public class DifferentClassWithAurgument {

	public static void main(String[] args) {

		MethodCallingInDifferentClassWithArgument a=new MethodCallingInDifferentClassWithArgument();
		a.duplicate(12);
		a.duplicate("BHUSHAN", 202);
		MethodCallingInDifferentClassWithArgument.duplicate(2020, 2021);
		MethodCallingInDifferentClassWithArgument.duplicate(123, "ramya", 536);
	}

}
