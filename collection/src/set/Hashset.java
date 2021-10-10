package set;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("Bhushan");
		hs.add("Shubham");
		hs.add("Tushar");
		hs.add("Pankaj");
		
		//hs.contains("Bhushan"); chck element found or not
		hs.add("ramya");//does not contain duplicate value
	
		hs.add("ramya");//order of insertion not define/indexing not allow
		
		
		hs.add("Bhushan");
		System.out.println(hs);
		//hs.remove("ramya");
		System.out.println(hs.size());
		
		for(String i:hs)
		{
			System.out.println(i);
		}
	}

}
