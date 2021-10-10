package charcterprint;
/*
 AAAAAAA
  AAAAA
   AAA
    A

 */
public class Char10 {

	public static void main(String[] args) {
		char alphabets='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--)
			{
				System.out.print(alphabets);
				
			}
			for(int l=3;l>=i;l--)
			{
				System.out.print(alphabets);
				
			}
			
			System.out.println();
		}

	}

}
