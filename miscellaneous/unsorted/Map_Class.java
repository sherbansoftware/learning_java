package miscellaneous.unsorted;

public class Map_Class {

	public static void main(String[] args) {
		 // initializing byte array
	     byte[] bval = new byte[] { 10, 45 };

	      // hashcode for value1
	      int retval = bval.hashCode();
	      
	      // printing hash code value
	      System.out.println("The hash code of value1 is: " + retval);
	      
	      // value2 for byte array
	      bval = new byte[] { 25, 35, 67 };

	      // hashcode for value2
	      retval = bval.hashCode();

	      // printing hash code value
	      System.out.println("The hash code of value2 is: " + retval);
	      
	      //Map<bval, retval> map
	   }

}
