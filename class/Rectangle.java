package p1;

import java.util.Scanner;

public class Rectangle {
	double x, y;

	public double getX() {
		return x;
	}

	void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return 2 * (x + y);
	}

	double getArea() {
		return x * y;
	}

	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Rectangle() {
		this.x = 2;
		this.y = 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		in.close();
		Rectangle r1 = new Rectangle(x, y);
		System.out.println("方的面积；" + r1.getArea());
		System.out.println("方的周长；" + r1.getPerimeter());
	}
}
