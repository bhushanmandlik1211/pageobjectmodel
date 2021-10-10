
public class IfElseIfStatement {

	public static void main(String[] args) {

		int a=100;
		
		if(a<40) {
			System.out.println("Fail");
		}
		
		else if(a>=40 && a<60) {
			System.out.println("D Grade");
		}
		
		else if(a>=60 && a<80) {
			System.out.println("C Grade");	
		}
		
		else if(a>=80 && a<90) {
			System.out.println("B Grade");	
		}
		
		else if(a>=90 && a<=100) {
			System.out.println("A Grade");	
		}
		
		else{
		System.out.println("Go to Hell");	
		}
	}

}
