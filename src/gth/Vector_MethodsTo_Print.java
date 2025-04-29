package gth;
import java.util.*;
public class Vector_MethodsTo_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println("Vector Print Using Enumeration ");
		Enumeration  enm = v.elements();
		while(enm.hasMoreElements()) {
			Object obj = enm.nextElement();
			System.out.println(obj);
		}
//		System.out.println(v);
		System.out.println("Vector Print Using Iterator ");
		Iterator i = v.iterator();
		while(i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}
		System.out.println("Show the vector data using normal for loop");
		for(int i1=0; i1<v.size(); i1++) {
			System.out.println(v.get(i1));
		}
		System.out.println("Show the vector data using foreach loop");
		for(Object obj:v){
			System.out.println(obj);
		}
		System.out.println("Show the vector data using ListIterator");
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			Object obj = li.next();
			System.out.println(obj);
		}
	}

}
