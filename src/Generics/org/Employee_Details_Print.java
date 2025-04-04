package Generics.org;

import java.util.*;

class Employee {
	private int id;
	private String name;
	private int sal;

	Employee() {

	}

	Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}

public class Employee_Details_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<Employee>();

		Employee emp1 = new Employee(1, "Kunal", 10000);
		Employee emp2 = new Employee(2, "Nikhil", 12000);
		Employee emp3 = new Employee(3, "Mayur", 13000);

		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);

		System.out.println("ID\tName\tSalary");
		for (Employee e : emp) {
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}

	}

}
