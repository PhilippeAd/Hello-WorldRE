package exercises;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calcPerimeter() {
		return 2 * length + 2 * width;
	}

	public double calcArea() {
		return length * width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}
}
