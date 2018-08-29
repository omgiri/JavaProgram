package day2;

abstract class AbstractExample {
	abstract void sound();

	public void color() {
		System.out.println("Grey");
	}
}

class Example extends AbstractExample {
	public void sound() {
		System.out.println("Woof");
	}

	public static void main(String[] args) {
		AbstractExample obj = new Example();
		obj.sound();	
	}
}
