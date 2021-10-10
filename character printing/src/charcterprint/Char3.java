package charcterprint;
/*
    A
   AA
  AAA
 AAAA

 */
public class Char3 {

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
			System.out.println();
		}
	}

}
