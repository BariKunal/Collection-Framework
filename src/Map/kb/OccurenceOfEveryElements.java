package Map.kb;
import java.util.*;
public class OccurenceOfEveryElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		LinkedHashMap map = new LinkedHashMap();
		int a[] = new int[10];
		System.out.println("Enter The Values In Array :");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			Object obj = map.get(a[i]);
			Integer count = (Integer)obj;
			if(count==null) {
				count = new Integer(0);
			}
			++count;
			map.put(a[i], count);
		}
		System.out.println("Display Occurence Of Every Elements :");
		Set<Map.Entry> entrySet = map.entrySet();
		for(Map.Entry m:entrySet){
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
