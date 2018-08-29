package day2;

public class MethodOverload {
	public int sum(int x, int y) {
		return (x + y);
	}

	public int sum(int x, int y, int z) {
		return (x + y + z);
	}

	public double sum(double x, double y) {
		return (x + y);
	}

	public static void main(String[] args) {
		MethodOverload ol = new MethodOverload();
        System.out.println(ol.sum(10,20));
        System.out.println(ol.sum(10,20,30));
        System.out.println(ol.sum(2.5,6.2));
	
	}
}
