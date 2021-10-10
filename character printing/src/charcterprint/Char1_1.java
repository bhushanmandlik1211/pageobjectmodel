package charcterprint;
/*
A 
A B 
A B C 
A B C D 
A B C D E 
 */
public class Char1_1 {

	public static void main(String args []) {
		char alphabets='A';
		
		for (int i=1;i<=5;i++)
		{
			alphabets='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(alphabets+" ");
				alphabets++;
			}
			System.out.println();
		}
	}
}
