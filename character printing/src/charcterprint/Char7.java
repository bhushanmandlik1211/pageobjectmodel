package charcterprint;
/*
 A A A A 
  A A A 
   A A 
    A 

 */
public class Char7 {

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
					System.out.print(alphabets+" ");
					
				}
				System.out.println();
			}

	}

}
