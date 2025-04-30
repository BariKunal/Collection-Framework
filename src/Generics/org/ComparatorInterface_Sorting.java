package Generics.org;
import java.util.*;

class Book{
	private int id;
	private String name;
	private int price;
	Book(){
		
	}
	Book(int id, String name, int price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
	void showBooks() {
		System.out.println("------------------------");
		System.out.println("ID\tName\tPrice");
		System.out.println(id+"\t"+name+"\t"+price);
//		System.out.println("------------------------");
	}
	
}

class SortById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		if(b1.getId()>b2.getId()) {
			return 1;
		}
		else if(b1.getId()<b2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}

class SortByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		return b1.getName().compareTo(b2.getName());
	}
}

class SortByPrice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Book b1 = (Book)o1;
		Book b2 = (Book)o2;
		if(b1.getPrice()>b2.getPrice()) {
			return 1;
		}
		else if(b1.getPrice()<b2.getPrice()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
public class ComparatorInterface_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> al = new ArrayList<>();

		Book bk = null;
		for (int i = 0; i < 3; i++) {
			System.out.println();
			System.out.print("Enter The Book Id :");
			int bid = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter The Book Name :");
			String bname = sc.nextLine();

			System.out.print("Enter The Book Price :");
			int bprice = sc.nextInt();

			bk = new Book(bid, bname, bprice);
			bk.setId(bid);
			bk.setName(bname);
			bk.setPrice(bprice);

			al.add(bk);
		}
		System.out.println("\nBefore Sorting Players");
		for (Book  b:al) { // all players print
			b.showBooks();
		}
		
		Collections.sort(al,new SortById());
		System.out.println("\nSorting Players By Id");
		System.out.println("---------------------------");
		System.out.println("ID\tName\tPrice");
		for(Book b:al) {
			
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
			
		}
		
		Collections.sort(al, new SortByName());
		System.out.println("\nSorting Players By Name");
		System.out.println("---------------------------");
		System.out.println("ID\tName\tPrice");
		for(Book b:al) {
			
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
			
		}
		
		Collections.sort(al, new SortByPrice());
		System.out.println("\nSorting Players By Price");
		System.out.println("---------------------------");
		System.out.println("ID\tName\tPrice");
		for(Book b:al) {
			
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
			
		}
	}

}
