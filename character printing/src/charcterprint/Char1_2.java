package charcterprint;
/*
A 
B C 
D E F 
G H I J 
K L M N O 

 */
public class Char1_2 {
	public static void main(String args []) {
		char alphabets='A';
		
		for (int i=1;i<=5;i++)
		{
		
			for(int j=1;j<=i;j++)
			{
				System.out.print(alphabets+" ");
				alphabets++;
			}
			System.out.println();
		}
	}

}
