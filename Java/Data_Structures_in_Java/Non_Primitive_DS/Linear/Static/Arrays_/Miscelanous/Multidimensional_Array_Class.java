package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Miscelanous;

public class Multidimensional_Array_Class {

	public static void main(String[] args) {

		int i;
		int j = 0;

		int[][] mia = new int[2][3];
		mia[0][0] = 5;
		mia[0][1] = 45;
		mia[0][2] = 645;
		mia[1][0] = 88;
		mia[1][1] = 95;
		mia[1][2] = 0;

		for (i = 0; i < mia.length; i++) {
			for (j = 0; j < mia[i].length; j++) {
				// System.out.println(mia[i][j]);
			}
		}
		System.out.println(mia[1][2]);
	}

}
