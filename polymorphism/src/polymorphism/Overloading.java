package polymorphism;

public class Overloading {

	public void addition(int aa)
	{
		int k=aa+aa;
		System.out.println(k);
	}
	
	public void addition(int a,int b)
	{
			int c=a+b;
			System.out.println(c);
	}
	
	public void addition(int p,int q,int r)
	{
		int z=p+q+r;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		Overloading o=new Overloading();
		o.addition(05);
		o.addition(10, 20);
		o.addition(100, 200, 300);

	}

}
