package map;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String >();
		
		map.put("Maharashtra", "Mh");
		map.put("Gujrat","Gj");
		map.put("Rajastan", "Rj");
		map.put("MadhyPradesh", "Mp");
		map.put("Gujrat","Gj");
		System.out.println(map.get("Maharashtra"));
		
		for (String i : map.values()) {
			  System.out.println(i);
			}

	}

}
