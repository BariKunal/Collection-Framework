package Map.kb;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
class Product{
	private int id;
	private String name;
	
	public Product(int id, String name){
		super();
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
		LinkedHashMap map=new LinkedHashMap();
		
		Product p1=new Product(1,"a");
		Product p2=new Product(2,"b");
		Product p3=new Product(3,"c");
		
		ArrayList al=new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		ArrayList al2=new ArrayList();
		al2.add(p1);
		al2.add(p2);
		al2.add(p3);
		
		map.put("M001",al);
		map.put("M002",al2);
		
		LinkedHashMap map2=new LinkedHashMap();
		
		map2.put("Production_one", map);
		map2.put("Production_two", map);
		
		Set<Map.Entry> entrySet=map2.entrySet();
		for(Map.Entry m:entrySet)
		{
			Object key=m.getKey();
			System.out.println(""+key+"_");
			System.out.println("_");
			
			Object val=m.getValue();
			LinkedHashMap a1=(LinkedHashMap)val;
			
			Set<Map.Entry> entrySet1=a1.entrySet();
			for(Map.Entry o:entrySet1)
			{
				String mName=(String)o.getKey();
				ArrayList prod=(ArrayList)o.getValue();
				System.out.println(mName);
				System.out.println("_");
				System.out.println("ID \t Tname ");
				
				for(Object o1:prod)
				{
					Product pp=(Product)o1;
					System.out.println(pp.getId()+"\t"+pp.getName());
				}
			}
		}
	}

}