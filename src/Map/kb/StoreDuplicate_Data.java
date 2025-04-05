package Map.kb;

import java.util.LinkedHashSet;

class Employee{
	private int id;
	private String name;
	
	Employee(){
		
	}
	Employee(int id, String name) {
		// TODO Auto-generated constructor stub
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
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(this.id==e.id && this.name.equals(e.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return id*1000;
	}
}
public class StoreDuplicate_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Employee> emp = new LinkedHashSet<Employee>();
		Employee emp1 = new Employee(1,"Kunal");
		Employee emp2 = new Employee(2,"Nikhil");
		Employee emp3 = new Employee(3,"Mayur");
		Employee emp4 = new Employee(1,"Kunal");
		Employee emp5 = new Employee(2,"Nikhil");
		Employee emp6 = new Employee(3,"Mayur");
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		
		System.out.println("Id\tName\n");
		for(Employee e:emp) {
			System.out.println(e.getId()+"\t"+e.getName());
		}
	}

}
