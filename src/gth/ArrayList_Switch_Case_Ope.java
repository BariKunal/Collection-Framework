package gth;

import java.util.*;

public class ArrayList_Switch_Case_Ope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		do {
			System.out.println("1: Add new data in ArrayList ");
			System.out.println("2: View all data from ArrayList ");
			System.out.println("3: Search Data using contains method ");
			System.out.println("4: Search data using indexOf() method ");
			System.out.println("5: delete data using index ");
			System.out.println("6: count total number of element from ArrayList ");
			System.out.println("7: check ArrayList  is empty or not");
			System.out.println("8: Exit ");

			System.out.println("Enter Your Choice :");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter The Elements In ArrayList");
				int value = sc.nextInt();
				al.add(value);
				System.out.println("Element Added...");
				System.out.println();
				break;
			case 2:
				if (al.isEmpty()) {
					System.out.println("ArrayList Is Empty..");
				} else {
					System.out.println("ArrayList Elements :");
					Iterator it = al.iterator();
					while (it.hasNext()) {
						Object obj = it.next();
						System.out.println(obj + " ");
					}

				}
				System.out.println();
				break;
			case 3:
				System.out.println("Enter The Search Element ");
				int skey = sc.nextInt();
				if (al.contains(skey)) {
					System.out.println("Element Found...");
				} else {
					System.out.println("Element Not Found...");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Enter The Date to Search Element :");
				skey = sc.nextInt();
				int res = al.indexOf(skey);
				if (res != -1) {
					System.out.println("Element Found...");
				} else {
					System.out.println("Element Not Found...");
				}
				System.out.println();
				break;
			case 5:
				System.out.println("Enter The Element to Delete :");
				skey = sc.nextInt();
				if (al.contains(skey)) {
					al.remove(Integer.valueOf(skey));
					System.out.println("Element Deleted...");
				} else {
					System.out.println("Element Not Present : ");
				}
				System.out.println();
				break;
			case 6:
				System.out.println("ArrayList Size Is : "+al.size());
				System.out.println();
				break;
			case 7:
				if(al.isEmpty()) {
					System.out.println("Array List Is Empty...");
				}
				else {
					System.out.println("Array List Is Not Empty...");
				}
				System.out.println();
				break;
			case 8:
				System.out.println();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice...");
			}
		} while (true);
	}

}
