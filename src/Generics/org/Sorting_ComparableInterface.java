package Generics.org;

import java.util.*;

class Player implements Comparable {
	private int id;
	private String name;
	private int run;

	Player() {

	}

	Player(int id, String name, int run) {
		this.id = id;
		this.name = name;
		this.run = run;
	}

	public void setId(int id) {
		this.id = id;
	}

	int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public void setRun(int run) {
		this.run = run;
	}

	int getRun() {
		return run;
	}

	public void ShowPlayer() {
//		System.out.println("-----Player Details-----");
		System.out.println("ID\tName\tRun");
		System.out.println(id+"\t"+name+"\t"+run);
		System.out.println("------------------------");
	}

	
	@Override
	public int compareTo(Object o) {
		
		 Player p= (Player)o;
		if (this.id > p.getId()) {
			return 1;
		} else if (this.id < p.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Sorting_ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> al = new ArrayList<>();

		Player pl = null;
		for (int i = 0; i < 3; i++) {
			System.out.println();
			System.out.print("Enter The Player Id :");
			int pid = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter The Player Name :");
			String pname = sc.nextLine();

			System.out.print("Enter The Player Run :");
			int prun = sc.nextInt();

			pl = new Player(pid, pname, prun);
			pl.setId(pid);
			pl.setName(pname);
			pl.setRun(prun);

			al.add(pl);
		}
		System.out.println("\nBefore Sorting Players");
		for (Player p : al) { // all players print
			p.ShowPlayer();
		}
		
		Collections.sort(al);
		System.out.println("\nAfter Sorting Players By Id");
		System.out.println("---------------------------");
		System.out.println("ID\tName\tRuns");
		for(Player p:al) {
			
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			
		}
	}

}
