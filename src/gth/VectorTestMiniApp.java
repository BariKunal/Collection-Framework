package gth;
import java.util.*;
public class VectorTestMiniApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		do {
			System.out.println("1: Add Vector Elements :");
			System.out.println("2: View Vector Elements :");
			System.out.println("3: Count Vector Elements :");
			System.out.println("4: Search Vector Element by value:");
			System.out.println("5:Search Element by index");
			System.out.println("6:Delete by using its index");
			System.out.println("7:Fetch elements by using get method");
			System.out.println("8: SubList");
			System.out.println("9: Remove element by value");

			
			System.out.println("Enter Your Choice:");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Add Vector Data :");
					int value = sc.nextInt();
					boolean b= v.add(value);
					
					if(b) 
					{
						System.out.println("Data added...");
					}
					else {
						System.out.println("Data not1 Added...");
					}
				break;
				
				case 2:
					Iterator itr = v.iterator();
					while(itr.hasNext())
					{
						Object obj = itr.next();
						System.out.println(obj);
					}
				break;
				
				case 3:
					System.out.println("Number Elements in Vector :"+v.size());
				break;
				
				case 4:
					System.out.println("Enter The Search Value :");
					value = sc.nextInt();
					b = v.contains(value);
					if(b)
					{
						System.out.println("Element Found..");
					}
					else
					{
						System.out.println("Element not Found...");
					}
				break;
				
				case 5:
					System.out.println("Enter The Search Index :");
					value = sc.nextInt();
					int ind = v.indexOf(value);
					if(ind != -1)
					{
						System.out.println("Data Found..");
					}
					else
					{
						System.out.println("Data not Found...");
					}
				break;
				
				case 10:
					System.exit(0);
					break;
				default :
					System.out.println("Invalid Input...");
			}
			
		}while(true);
		

	}

}
