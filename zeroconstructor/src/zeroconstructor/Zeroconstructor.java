package zeroconstructor;

public class Zeroconstructor {

	int a;
	String name;
	
	//declaration and initialisation odf zero constructor/non argument constructor
	Zeroconstructor(){
		a=143;
		name="bhushan";
	}
	public static void main(String[] args) {
		Zeroconstructor z=new Zeroconstructor();
		System.out.println(z.a);
		System.out.println(z.name);
	}

}
