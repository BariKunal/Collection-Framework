package gth;

import java.util.Iterator;
import java.util.Vector;

public class vector1 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(101);
		v.add("Kunal");
		v.add(2024);
		
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			System.out.println(obj);
//			System.out.println(i.next());
		}
		
	}

}
