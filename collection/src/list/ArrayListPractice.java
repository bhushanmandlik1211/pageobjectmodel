package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> animal=new ArrayList<String>();
		animal.add("dog");
		animal.add("cat");
		animal.add("horse");
		animal.add("ox");
		animal.add("cow");
		animal.add("cow");
		System.out.println(animal); //to print all animal
		System.out.println(animal.get(0)); //to print perticclar animal by index
		animal.set(0, "goat"); //to repalce by anather using index
		System.out.println(animal);
		animal.remove(3); //to remve element from array
		System.out.println(animal);
		animal.size();// to find size of array
		System.out.println(animal.size());
		//animal.clear();//to remoe all element from array
		//System.out.println(animal);
		//Collections.sort(animal);// for sorting arry
		System.out.println(animal);
	}

}
