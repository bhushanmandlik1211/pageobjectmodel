package testngg_all;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)


public class Listenr_practice {
	
	
	@Test(invocationCount=3)
	public void a(){
		System.out.println("hiii");
	}
	@Test
	public void b() {
		Assert.assertEquals(10, 12);
		System.out.println("good");
	}
	@Test
	public void c() {
		System.out.println("afternoon");
	}

	
}
