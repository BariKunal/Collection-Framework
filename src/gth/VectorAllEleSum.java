package gth;

import java.util.*;


public class VectorAllEleSum {

	public static void main(String[] args) {
		
		int sum=0;
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			sum = sum + (int)obj;
		}
		System.out.println("Sum of Vector Elements Is :"+sum);
	}

}
