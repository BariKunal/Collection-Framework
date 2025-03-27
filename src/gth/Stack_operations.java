package gth;
import java.util.*;
public class Stack_operations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack kb = new Stack();
		
		do {
			System.out.println("1: Enter Elements in Stack");
			System.out.println("2: Remove Elements in Stack");
			System.out.println("3: View Stack Elements");
			System.out.println("4: Preview Last Element");
			System.out.println("5: Exit");
			
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: 
				System.out.println("Enter The Element in Stack:");
				int value= sc.nextInt();
				
				kb.push(value);
				break;
			case 2:
				boolean b = kb.isEmpty();
				if(b)
				{
					System.out.println("Stack is Empty..");
				}
				else {
					System.out.println(kb.pop());
				}
				break;
			case 3:
				ListIterator itr = kb.listIterator(kb.size());
				while(itr.hasPrevious())
				{
					System.out.println(itr.previous());
				}
				
				break;
			case 4:
				b = kb.isEmpty();
				if(b)
				{
					System.out.println("Stack is Empty..");
				}
				else {
					System.out.println(kb.peek());
				}
				
				break;
			case 5:
				System.exit(ch);
				break;
				default:
					System.out.println("Invalid Input...");
			}
			
		}while(true);
		

	}

}
