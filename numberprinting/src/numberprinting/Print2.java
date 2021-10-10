package numberprinting;

public class Print2 {

	public static void main(String args[]) {
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}
}
