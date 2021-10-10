package list;

import java.util.Collections;
import java.util.LinkedList;


public class LinkedListPrctice {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("ac");
		ll.add("e");
		ll.add("bf");
		ll.add("a");
		//Collections.sort(ll);
		
		System.out.println(ll);
		ll.addFirst("aa");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.addLast("aa");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.size());
	}

}
