package Map.kb;
import java.util.*;

public class Cricket_Teams_And_Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap map = new LinkedHashMap();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number Of Countries You Want to Add :");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.println("\n\nEnter The Country Name :");
			String Cname = sc.nextLine();
			
			ArrayList pl = new ArrayList();
			System.out.println("Enter The Number of Players for "+Cname);
			int players = sc.nextInt();
			sc.nextLine();
			
			for(int j=0; j<players; j++) {
				System.out.print("Enter The Player Name :");
				String Pname = sc.nextLine();
				pl.add(Pname);
			}
			map.put(Cname, pl);
		}
		
		//System.out.println("\n========="+Players+"===========");
		Set<Map.Entry> set = map.entrySet();
		/*for(Map.Entry e:set) {
			Object key = e.getKey();
			Object value = e.getValue();
			ArrayList pl = (ArrayList)value;

			System.out.println(e.getKey()+"\t"+e.getValue());
			System.out.println("_____________________________");
		}*/
		
		for (Object obj : set) {
            Map.Entry e = (Map.Entry) obj;
            String key = (String) e.getKey();
            ArrayList value = (ArrayList) e.getValue();

            System.out.println("\n=============== " + key + " ===============");
            for (Object val : value) {
                System.out.println(val);
            }
            
        }
		 
	}

}
