package array;


public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		/*a[0]=10;
		a[1]=12;
		a[2]=03;
		a[3]=46;
		a[4]=5;*/
		
		System.out.print("before sorting array is ");
		
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print(" array in reverse order ");
		
	
		
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print(a[i]+" ");
		}

	}

}
