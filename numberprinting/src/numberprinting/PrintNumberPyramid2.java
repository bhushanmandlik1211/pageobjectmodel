package numberprinting;

public class PrintNumberPyramid2 {
	

		public static void main(String[] args) {
		
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int k=4;k>=i;k--)
				{
					System.out.print(k);
				}
			for(int l=3;l>=i;l--)
				{
					System.out.print(l);
				}
				System.out.println();
			}
		}

	}


