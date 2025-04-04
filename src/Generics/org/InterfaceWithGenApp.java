package Generics.org;

interface Area<T> {
	void setRadius(T r);
}

class Circle<E> implements Area<Integer> {
	@Override
	public void setRadius(Integer r) {
		System.out.println("Integer r " + r);
	}
}

class Cirm<E> implements Area<Double> {
	@Override
	public void setRadius(Double r) {
		System.out.println("Double r  " + r);
	}
}

public class InterfaceWithGenApp {

	public static void main(String[] args) {
		Circle<Integer> c = new Circle<Integer>();
		c.setRadius(5);
		Cirm<Double> cm = new Cirm<Double>();
		cm.setRadius(10.6);
	}
}
