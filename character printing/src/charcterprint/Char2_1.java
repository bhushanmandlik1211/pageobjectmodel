package charcterprint;
/*
A B C D 
E F G 
H I 
J 
*/
public class Char2_1 {

	public static void main(String[] args) {
		char alphabets='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(alphabets+" ");
				alphabets++;
			}
			System.out.println();
		}
	}

}
