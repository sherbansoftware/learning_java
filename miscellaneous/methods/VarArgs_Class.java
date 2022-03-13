package miscellaneous.methods;

public class VarArgs_Class {

	int[] x;
	int y;
	String str;

	public VarArgs_Class(int... xs) {

		for (int i : xs) {
			System.out.println(i);
		}

	}

}
