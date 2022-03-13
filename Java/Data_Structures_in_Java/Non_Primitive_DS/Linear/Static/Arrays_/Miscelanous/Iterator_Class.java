package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_.Miscelanous;

import java.util.Iterator;

public class Iterator_Class {

	static int[] intArray = { 54, 75, 2, 33, 2, 0, 44 };

	int nextInt = 0;
	static Iterator<Integer> iterator = new Iterator<Integer>() {

		int i = 0;

		@Override
		public boolean hasNext() {

			return intArray.length > i;
		}

		@Override
		public Integer next() {
			Integer in = Integer.valueOf(intArray[i++]);
			return in;
		}

	};

	public static void main(String[] args) {
		// Iterator_Class iClass=new Iterator_Class();
		//while (Iterator_Class.iterator.hasNext()) {
			//System.out.print(iterator.next() + " ");
		//}
//or 
		iterator.forEachRemaining(e -> System.out.println(e));

	}

}
