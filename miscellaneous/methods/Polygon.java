package miscellaneous.methods;

public class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Polygon polygonFrom(Point... corners) {
		int numberOfSides = corners.length;
		double squareOfSide1, lengthOfSide1;
		squareOfSide1 = (corners[1].x - corners[0].x) * (corners[1].x - corners[0].x)
				+ (corners[1].y - corners[0].y) * (corners[1].y - corners[0].y);
		lengthOfSide1 = Math.sqrt(squareOfSide1);

		// more method body code follows that creates and returns a
		// polygon connecting the Points
		System.out.printf("%.2f\n", lengthOfSide1);
		return null;
	}

}
