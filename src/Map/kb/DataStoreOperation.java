package Map.kb;
import java.util.*;
public class DataStoreOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1: Store Data in Map");
			System.out.println("2: View All Data in Map");
			System.out.println("3: Search Data in Map");
			System.out.println("4: Delete Data in Map");
			System.out.println("5: Count total number of elements in map");
			System.out.println("6: Display Only keys in Map");
			
			System.out.print("Enter Your Choice :");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter The Id :");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter The Name :");
				String name = sc.nextLine();
				map.put(id, name);
				
				break;
			case 2:
				Set<Map.Entry> entrySet = map.entrySet();
				System.out.println("ID\tName");
				for(Map.Entry e:entrySet) {
					System.out.println(e.getKey()+"\t"+e.getValue());
					System.out.println("_____________________________");
				}
				break;
			case 3:
				System.out.println("Enter The Key For Search :");
				int search = sc.nextInt();
				boolean b = map.isEmpty();
				if(b) {
					System.out.println("Map Is Empty...");
				}
				else {
					System.out.println("Data Found "+map.containsKey(search));
				}
				break;
			case 4 :
				System.out.println("Enter The Key For Search :");
				search = sc.nextInt();
				b = map.isEmpty();
				if(b) {
					System.out.println("Map Is Empty...");
				}
				else {
					System.out.println("Data Deleted.. "+map.remove(search));
				}
				break;
			case 5:
				System.out.println("Total Number of Data is :"+map.size());
				break;
			case 6:
				Set<Map.Entry> Set = map.entrySet();
				for(Map.Entry e:Set) {
					System.out.println(e.getKey());
				}
				
				break;
				default :
					System.out.println("Invalid Choice...");
			}
		}while(true);
	}

}
