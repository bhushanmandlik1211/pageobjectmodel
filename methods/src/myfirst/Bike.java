package myfirst;

public class Bike {
//static method
	public static void bullet() {
		System.out.println("bullet is running");
		}
//static method
public static void ktm() {
	System.out.println("ktm is running");
}
//non static method
public void shine() {
	System.out.println("shine is running");
}
//non static method
public void unicorn() {
	System.out.println("unicorn is running");
}
public static void main(String[] args) {
	System.out.println("all branded bike models are running are as follows:");
	bullet();
	ktm();
	Bike bk=new Bike();
	bk.shine();
	bk.unicorn();
}
}