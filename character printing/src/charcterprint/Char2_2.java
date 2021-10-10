package charcterprint;
/* A B C D 
   A B C 
   A B 
   A 
*/

public class Char2_2 {

	public static void main(String[] args) {
		char alphabets='A';
		for(int i=1;i<=4;i++)
		{
			alphabets='A';
			for(int j=4;j>=i;j--)
			{
				System.out.print(alphabets+" ");
				alphabets++;
			}
			System.out.println();
		}

	}

}
