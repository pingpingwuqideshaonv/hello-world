package p1;

import java.util.Scanner;

public class Circle {
	double radius;

	public double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
		this.radius = 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
		in.close();
		Circle r1 = new Circle();
		System.out.println("圆的面积；" + r1.getArea());
		System.out.println("圆的周长；" + r1.getPerimeter());
	}
}
