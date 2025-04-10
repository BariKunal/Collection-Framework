package Generics.org;

import java.util.*;

class A {
	void show() {
		System.out.println("I am A method");
	}
}

class B extends A {
	void display() {
		System.out.println("I am display method");
	}
}

class C {
	void accept(List<? super B> list) {
		for (Object a1 : list) {
			((A) a1).show();
		}
	}
}

public class LowerBoundApp {
	public static void main(String x[]) {
		C c1 = new C();
		A a1 = new A();
		A a2 = new A();
		List<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		c1.accept(list);
	}
}
