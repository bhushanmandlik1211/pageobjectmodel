package testngg_all;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test
	public void a(){
		System.out.println("hiii");
	}
	@Test(enabled=false)
	public void b() {
		System.out.println("good");
	}
	@Test
	public void c() {
		System.out.println("afternoon");
	}

}
