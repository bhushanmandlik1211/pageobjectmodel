package testngg_all;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertion {
	
	@Test
	public void a(){
		Assert.assertEquals(10, 12);
		System.out.println("hiii");
	}
	@Test
	public void b() {
		System.out.println("good");
	}
	@Test
	public void c() {
		System.out.println("afternoon");
	}

}
