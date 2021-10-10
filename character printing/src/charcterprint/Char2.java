package charcterprint;
/*
A A A A 
A A A 
A A 
A 

 */

public class Char2 {

	public static void main(String[] args) {
		char alphabets='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(alphabets+" ");
				
			}
			System.out.println();
		}
	}
}
