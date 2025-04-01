package Map.kb;

import java.util.*;


public class Map1stPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put(1, "ABC");
		map.put(2, "PQR");
		map.put(444, "XYZ");
		map.put(11, "MNO");
		map.put(32, "STU");
		
		Set<Map.Entry> es = map.entrySet();
		for(Map.Entry e:es) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}

}
