package testngg_all;

import org.testng.annotations.Test;

public class Invocationcount {
	
	@Test
	public void a(){
		System.out.println("hiii");
	}
	@Test
	public void b() {
		System.out.println("good");
	}
	@Test(invocationCount=4)
	public void c() {
		System.out.println("afternoon");
	}

}
