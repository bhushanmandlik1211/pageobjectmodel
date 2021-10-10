package encapsulation;

public class School {
	
	public static void main(String [] args){
		
		Student s = new Student();
		s.setname("Bhushan");
		s.setaddress("Junnar");
		s.setage(20);
		s.setmb_no("8552875388");
		
		System.out.println("Name of student is :"+s.getname());
		System.out.println("Address of student is :"+s.getaddress());
		System.out.println("Age of student is :"+s.getage());
		System.out.println("Mobile number of student is :"+s.getmb_no());
	}
}