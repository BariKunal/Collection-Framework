package gth;

import java.util.*;

public class Stack_Operarions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		
		do {
			System.out.println("1: Enter The Data In Stack ");
			System.out.println("2: Print Stack Data ");
			System.out.println("3: Remove Data In Stack ");
			System.out.println("4: Exit Stack ");
			
			System.out.println("Enter Your Choice... ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter The Data : ");
				int data = sc.nextInt();
				s.push(data);
				System.out.println("Data Added...");
				break;
			case 2:
				ListIterator it = s.listIterator(s.size());
				while(it.hasPrevious()) {
					Object obj = it.previous();
					System.out.println(obj);
				}
				break;
			case 3:
				
				break;
			case 4:
				break;
				default :
					System.out.println("Wrong Choice...");
			}
		}while(true);
	}

}
