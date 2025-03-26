package gth;
import java.util.*;

class Book
{
	private int id;
	private String name;
	private int price;
	
	
	Book()
	{
		
	}
	Book(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
public class VectorBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		Book b1 = new Book("ABC",1,100);
		Book b2 = new Book("MNO",2,200);
		Book b3 = new Book("PQR",3,300);
		Book b4 = new Book("STV",4,400);
		
		v.add(b1);
		v.add(b2);
		v.add(b3);
		v.add(b4);

		
		System.out.println("Display Book Data:");
		Iterator itr= v.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			Book b = (Book) obj;
			
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
		}
		System.out.println("Enter book id for search");
		int bid=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<v.size();i++) {
			
			 Book b=(Book)v.get(i);
			 if(b.getId()==bid) {
				 flag=true;
				 break;
			 }
		}
		if(flag) {
			System.out.println("Book found");
		}
		else {
			System.out.println("Book not found");
		}

	}

}
