package mathmaticalprograms;

public class PrimeNumberBetween1To100 {

	public static void main(String[] args) {
		int temp=0;
		
		System.out.println("Prime numbers between 1 to 100 is :");
		
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0) 
				{
				temp=temp+1;
				}
			}
			if(temp==0)
			{
				
				System.out.print(i+" ");
			}
			else
			{
				temp=0;
			}
		}
		
	}	
}
