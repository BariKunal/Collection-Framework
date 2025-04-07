package Map.kb;
import java.util.*;
public class UniqueValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter The Array Elements :"+size);
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
		System.out.println("Unique Elements In Array :");
		Set<Map.Entry> entrySet = map.entrySet();
		for(Map.Entry m:entrySet) {
			if((Integer) m.getValue() == 1) {
				System.out.println(m.getKey()+"\t"+m.getValue());
			}
		}
	}

}
