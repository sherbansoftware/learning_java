package miscellaneous.objects;

public class Points {

	 int x = 2, y =3; 
	 Points() { System.out.println("default"); }
	 public Points(int x, int y) { this.x = x; this.y = y; }
	 /* ATest.A Point instance is explicitly created at
	 class initialization time: */
	 static Points origin = new Points(0,0);
	 /* ATest.A String can be implicitly created
	 by a + operator: */
	 public String toString() { return "(" + x + "," + y + ")"; } 
	
}
