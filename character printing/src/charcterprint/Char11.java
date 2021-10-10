package charcterprint;
/*
    A
   AAA
  AAAAA
 AAAAAAA
  AAAAA
   AAA
    A
 */
public class Char11 {

	public static void main(String[] args) {
		char alphabets='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(alphabets);
				
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(alphabets);
				
			}
			
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=3;k>=i;k--)
			{
				System.out.print(alphabets);
				
			}
			for(int l=2;l>=i;l--)
			{
				System.out.print(alphabets);
				
			}
			
			System.out.println();
		}
	}

}
