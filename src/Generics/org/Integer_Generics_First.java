package Generics.org;
import java.util.*;

public class Integer_Generics_First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		for(Integer a:al) {
			System.out.print(a+" ");
		}
	}

}
