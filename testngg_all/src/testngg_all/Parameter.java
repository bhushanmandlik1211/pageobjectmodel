package testngg_all;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	

	@Test
	@Parameters({"x","y"})
	public void a(int a,int b){
		System.out.println(a+b);
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
