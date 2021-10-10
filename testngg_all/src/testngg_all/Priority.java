package testngg_all;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=2)
	public void a(){
		System.out.println("hiii");
	}
	@Test(priority=1)
	public void b() {
		System.out.println("good");
	}
	@Test(priority=0)
	public void c() {
		System.out.println("afternoon");
	}
}
