package array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0]=10;
		a[1]=12;
		a[2]=03;
		a[3]=46;
		a[4]=5;
		
		System.out.println("before sorting array is ");
		
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]);
		}
		
		System.out.println("afters sorting array is ");
		
		Arrays.sort(a);
		
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]);
		}
	}

}
