package charcterprint;
/*
A 
A A 
A A A 
A A A A 
A A A A A 
 */
public class Char1 {

	public static void main(String[] args) {
		char alphabets='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(alphabets+" ");
			}
			System.out.println();
		}
	}

}
