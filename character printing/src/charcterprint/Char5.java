package charcterprint;
/*
   A
  AA
 AAA
AAAA
 AAA
  AA
   A
 */
public class Char5 {

	public static void main(String[] args) {
		
		char alphabets='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(alphabets);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print(alphabets);
			}
			System.out.println();
		}
	}

}
