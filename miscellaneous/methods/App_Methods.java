package miscellaneous.methods;

public class App_Methods {

	public static void main(String[] args) {
		int[] va = { 55, 89, 55, 6, 2 };
		// VarArgs_Class var = new VarArgs_Class(va);

		// Employee emp =new Employee(1, "Chrys", "addrsjhfess", "phone", "email");
		// Employee emp1 =new Employee(2, "Adelina", "ahgcdjh", "01478888", "email22");

		Polygon poligon = new Polygon();
		Point[] corners = { Point.origin, new Point(2, 4) };

		// poligon.polygonFrom(corners);

		Circle circle = new Circle(2, 4, 6);

		Circle circle1 = new Circle(2, 4, 8);
		// circle1.calculateCircleArea();

		circle.moveCircle(circle, 2, 4);

		String co = circle.toString();

		System.out.println(co);
	}

}
