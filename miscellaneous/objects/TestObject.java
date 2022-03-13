package miscellaneous.objects;

public class TestObject {

	public static void main(String[] args) {
		/*
		 * ATest.A Point is explicitly created using newInstance:
		 */
		Points p = null;

		try {
			p = (Points) Class.forName("miscellaneous.objects.Points").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * An array is implicitly created by an array constructor:
		 */
		Points a[] = { new Points(0, 0), new Points(1, 1) };
		/*
		 * Strings are implicitly created by + operators:
		 */
	
		System.out.println("p: " + p);
		System.out.println("a: { " + a[0] + ", " + a[1] + " }");
		
		/*
		 * An array is explicitly created by an array creation expression:
		 */
		String sa[] = new String[2];
		sa[0] = "he";
		sa[1] = "llo";
		System.out.println(sa[0] + sa[1]);
		
	}
}
