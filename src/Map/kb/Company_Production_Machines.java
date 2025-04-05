package Map.kb;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
class Company{
	private int id;
	private String name;
	
	Company(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Company_Production_Machines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap();
		Company c = new Company(1,"a");
		Company c1 = new Company(2,"b");
		Company c2 = new Company(3,"c");
		
		ArrayList al = new ArrayList();
		al.add(c);
		al.add(c1);
		al.add(c2);
		
		ArrayList al1 = new ArrayList();
		al.add(c);
		al.add(c1);
		al.add(c2);
		
		map.put("M001", al);
		map.put("M002", al1);
		
		LinkedHashMap map2 = new LinkedHashMap();
		map2.put("Production 1", al);
		map2.put("Production 2", al1);
		
		Set<Map.Entry> entrySet=map2.entrySet();
		for(Map.Entry m:entrySet) {
			Object key = m.getKey();
			System.out.println("________"+key+"________");
			System.out.println("_______________________");
			
			Object val = m.getValue();
			System.out.println("________"+val+"________");
			System.out.println("_______________________");
			
			
			LinkedHashMap a1=(LinkedHashMap)val;
			
			Set<Map.Entry> entrySet1=a1.entrySet();
			for(Map.Entry o:entrySet1)
			{
				String mName=(String)o.getKey();
				ArrayList prod=(ArrayList)o.getValue();
				System.out.println(mName);
				System.out.println("__________________");
				System.out.println("ID \t Tname ");
				
				for(Object o1:prod)
				{
					Company pp=(Company)o1;
					System.out.println(pp.getId()+"\t"+pp.getName());
				}
			}
		}	
	}

}

