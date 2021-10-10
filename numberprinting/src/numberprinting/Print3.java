package numberprinting;

public class Print3 {

	public static void main(String[] args) {
		int num=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");//j=num
				//num++;
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(j+" ");//j=num
				//num++;
			}
			System.out.println();
		}
	}

}
