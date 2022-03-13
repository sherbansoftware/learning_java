package miscellaneous.methods;

public class Circle {
	private int x, y, radius;

	public Circle() {
	};

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;

	}

	public void setOrigin(int x, int y) {
	}

	public void moveCircle(Circle circle, int deltaX, int deltaY) {

		// code to move origin of circle to x+deltaX, y+deltaY
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);
		System.out.println("New point " + (x + deltaX) + "," + (y + deltaY));
		// code to assign a new reference to circle

	}

	public float calculateCircleArea() {

		float pi = 3.1415f;
		float area = pi * radius * radius;
		System.out.printf("Circle's area is: %.2f%n ", area);
		return area;

	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getRadius()="
				+ getRadius() + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
