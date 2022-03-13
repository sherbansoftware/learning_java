package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Miscelanous;


import java.util.Arrays;
import java.util.List;

public class ByteArray {

	public static void main(String[] args) throws ClassNotFoundException {
		Byte[] num = new Byte[100];
		int f = 0xFFFF;

		long[] d = new long[280];
		double d2 = 1.233e2;
		// System.out.println("ywdfxyw\"\"f\\wyew\nefwef");
		Class<?> class1 = Class.forName("Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Miscelanous.ByteArray");
		int[] anArray = new int[10];
		
		int hashcode = anArray.hashCode();
		System.out.println(anArray + "**" + hashcode);

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };

		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);
		System.out.println(names.length);

		List<Integer> list = Arrays.asList(10, 20, 30);
		List<Integer> list1 = Arrays.asList(40, 50);

		Object[] obj = { list, list1 };
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].toString());
		}

		int[] in1 = { 1, 2, 3 };
		int[] in2 = new int[3];
		in2[0] = 3;
		in2[1] = 3;
		in2[2] = 4;

		int[][] ni = { in1, in2 };

		// ni[0][0]=1;
		// ni[1][0]=2;

		for (int i = 0; i < ni.length; i++) {

			for (int j = 0; j < in2.length; j++)
				System.out.print(ni[i][j] + " ");

		}
	}
}
