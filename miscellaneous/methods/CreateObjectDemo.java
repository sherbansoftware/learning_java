package miscellaneous.methods;

public class CreateObjectDemo {

	public static void main(String[] args) {

		// Declare and create a point object and two rectangle objects.
		Rectangle re = new Rectangle();
		
		Point originOne = new Point(23, 94);

		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);

		// display rectOne's width, height, and area
		System.out.println("Width of rectOne: " + rectOne.width);
		System.out.println("Height of rectOne: " + rectOne.height);
		System.out.println("Area of rectOne: " + rectOne.getArea());

		// set rectTwo's position
		rectTwo.origin = originOne;

		// display rectTwo's position
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

		// move rectTwo and display its new position
		rectTwo.move(40, 72);
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
		Integer area =new Rectangle(100, 50).getArea();
		System.out.println("Area is: "+area);
	}
}
