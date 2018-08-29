package homework2;

import java.util.Scanner;

public class AreaOfCircle {
	Scanner sc = new Scanner(System.in);
	double radius;

	// Calculate the area of circle
	public void Area() {
		System.out.println("Enter your Radius");
		radius = sc.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of a circle is = " + area);
	}

	// calculates the perimeter of circle
	public void PerimeterOfCircle() {
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter of a circle =" + perimeter);
	}

	// Calculate the area of rectangle and perimeter
	public void areaOfRectangle() {
		System.out.println("Enter the lenght of a rectangle");
		double length = sc.nextDouble();
		System.out.println("Enter the width of a rectangle");
		double width = sc.nextDouble();

		double areaofrec = length * width;
		System.out.println("Area of Rectangle is =" + areaofrec);

		double perimeterofrec = 2 * (length + width);
		System.out.println("Perimeter of a rectangle is =" + perimeterofrec);
	}

	// Finds odd or even number
	public void OddEven() {
		System.out.println("Enter your first number");
		int OddEven = sc.nextInt();
		if (OddEven % 2 == 0) {
			System.out.println(OddEven + " is Even number");
		} else
			System.out.println(OddEven + " Is odd Number");
	}

	// Java Program to display fibonacci series
	public void fibonacci() {
		int n = 20, t1 = 0, t2 = 1;
		System.out.println(n);
		while (t1 <= n) {
			System.out.println(t1);
			int total = t1 + t2;
			t1 = t2;
			t2 = total;
		}

	}
	//Calculating factor 
	public void factor (){
		int    fact = 1;
		for(int c = 1; c<=5; c++)
		fact = fact*c; 
		System.out.println(fact);
	}

	public static void main(String[] args) {
		AreaOfCircle ar = new AreaOfCircle();
		ar.Area();
		ar.PerimeterOfCircle();
		ar.areaOfRectangle();
		ar.OddEven();
		ar.fibonacci();
		ar.factor();
	}
}
