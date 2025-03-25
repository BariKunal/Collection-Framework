package gth;
import java.util.*;
public class SortingVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(10);
		v.add(2);
		v.add(30);
		v.add(5);
		v.add(25);
		System.out.println("Data Before Sorting");
		Iterator itr= v.iterator();
		while(itr.hasNext()) {
			Object obj  = itr.next();
			System.out.println(obj);
		}
		//perform sorting 
		for(int i=0; i<v.size();i++) {
			for(int j=(i+1); j<v.size();j++) {
			
				   Object prev=v.get(i);
				   Object next=v.get(j);
				   if((int)prev>(int)next) {
					   v.set(i, next);
					   v.set(j, prev);
				   }
			}
		}
		
		System.out.println("Data After Sorting");
		  itr= v.iterator();
		while(itr.hasNext()) {
			Object obj  = itr.next();
			System.out.println(obj);

	}

	}
}
