package testngg_all;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assetion {
	
	@Test
	public void a(){
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(52, 44);
		System.out.println("hiii");
		sf.assertAll();
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
