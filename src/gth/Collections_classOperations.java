package gth;
import java.util.*;
public class Collections_classOperations {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(10);
		al.add(100);
		al.add(20);
		al.add(50);
		al.add(90);
		al.add(40);
		
		Object maxValue = Collections.max(al);
		System.out.println("Max value from ArrayList is "+maxValue);
		Object minValue = Collections.min(al);
		System.out.println("Min value from ArrayList is "+minValue);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

	}

}
