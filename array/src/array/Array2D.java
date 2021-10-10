package array;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [2][2];
		
		a[0][0]=1;
		a[1][1]=2;
		a[2][2]=3;
		a[3][3]=4;
		
		
		for(int i=0;i<=a.length;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				System.out.println(a[i][j]);
			}
			System.out.println(" ");
		}
	}

}
