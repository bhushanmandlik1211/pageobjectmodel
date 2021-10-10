package testngg_all;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups={"manual","automation"})
	public void a(){
		System.out.println("hiii");
	}
	@Test(groups={"automation","api"})
	public void b() {
		System.out.println("good");
	}
	@Test(groups={"api","manual"})
	public void c() {
		System.out.println("afternoon");
	}
	@Test(groups="manual")
	public void d(){
		System.out.println("morning");
	}
	@Test(groups="automation")
	public void e() {
		System.out.println("night");
	}
	@Test(groups="api")
	public void f() {
		System.out.println("bye");
	}
}
