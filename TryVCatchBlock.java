package day2;

public class TryVCatchBlock {

	public static void main(String[] args) {
		int a = 0;
		int b = 20;
		try {
			int fraction = b / a;
			System.out.println("Execute value" + fraction);
			System.out.println("This line will not execute");

		} catch (ArithmeticException e) {
		}
		System.out.println("End of main");
	}
}