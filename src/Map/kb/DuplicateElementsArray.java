package Map.kb;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedHashMap map = new LinkedHashMap();
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			Object obj = map.get(a[i]);
			Integer count = (Integer)obj;
			if(count==null) {
				count = new Integer(0);
			}
			++count;
			map.put(a[i], count);	
		}
		System.out.println("Duplicates elements in array :");
		Set<Map.Entry> entrySet = map.entrySet();
		for(Map.Entry m:entrySet) {
			if((Integer) m.getValue() > 1) {
				System.out.println(m.getKey()+"\t"+m.getValue());
			}
		}
	}

}
