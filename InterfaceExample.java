package day2;

public class InterfaceExample {
	interface Pet {
		public void test();

		public void greeting();
	}

	static class Dog implements Pet {
		public void test() {
			System.out.println("Interface Method implemented");
		}

		public void greeting() {
			System.out.println("hi");
		}

		public static void main(String[] args) {
			Pet p = new Dog();
			p.test();
			p.greeting();
		}
	}
}