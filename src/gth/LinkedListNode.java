package gth;

import java.util.*;

public class LinkedListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList li = new LinkedList();

		do {
			System.out.println("\t1: Add Node at First :");
			System.out.println("\t2: Add Node at Last :");
			System.out.println("\t3: Remove Node at First :");
			System.out.println("\t4: Remove Node at Last :");
			System.out.println("\t5: View All Data from LinkedList :");
			System.out.println("\t6: Exit :");
			System.out.println("\tEnter Your Choice...");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter The Node at First :");
				int fNode = sc.nextInt();
				li.addFirst(fNode);
				break;
			case 2:
				System.out.println("Enter The Node at Last :");
				int lNode = sc.nextInt();
				li.addLast(lNode);
				break;
			case 3:
				System.out.println("If You Want Remove Node At First \n Press 1 For Remove :");
				int press = sc.nextInt();
				if(press==1) {
					li.removeFirst();
					System.out.println("Data Deleted...");
				}
				else {
					System.out.println("Not Deleted....");
				}
				break;
			case 4:
				System.out.println("If You Want Remove Node At Last \n Press 1 For Remove :");
				press = sc.nextInt();
				if(press==1) {
					li.removeLast();
					System.out.println("Data Deleted...");
				}
				else {
					System.out.println("Not Deleted....");
				}
				break;
			case 5:
				if(li.isEmpty()) {
					System.out.println("LinkedList Is Empty...");
				}
				else {
					System.out.println("LinkedList Data....");
					for(Object obj:li) {
						System.out.println(obj);
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice...");
			}
		} while (true);
	}

}
