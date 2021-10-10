package non_Primitive_Casting;

public class Bank {

		void method(StateBankOfIndia sbi) 
		{
		sbi.Headoffice();	
		}
	public static void main(String[] args) {
		Bank b= new Bank();
		StateBankOfIndia sbi1=new StateBankOfPatiyala();
		b.method(sbi1);
	}

}
