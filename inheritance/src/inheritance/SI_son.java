package inheritance;

public class SI_son extends SI_father{

	public void bike()
	{
		System.out.println("son bike");
	}
	public void job()
	{
		System.out.println("son job");
	}
	public static void main(String[] args) {
		
		SI_son s=new SI_son();
		s.car();
		s.home();
		s.gold();
		s.land();
		s.bike();
		s.job();
	}

}
