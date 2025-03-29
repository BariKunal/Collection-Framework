package gth;

import java.util.*;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Kunal");
		al.add(101);
		al.add("Pune");
		
		List l=Collections.synchronizedList(al);	//It creates the arraylist synchronozed.
		System.out.println(l);
	}

}
