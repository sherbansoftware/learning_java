package Miscelanous.miscellaneous.unsorted;

import Miscelanous.Box;

public class LearnTest {

	public static void main(String[] args) {

		int x = (int) Math.pow(2, 21);
		char dc = new Character('0');
		int[] intT = { 10, 1, 2, 65, 89, 45, 11, 471 };

		for (int i : intT) {

			boolean javaLetter = Character.isJavaIdentifierStart(i);
			boolean javaLetterAndDigits = Character.isJavaIdentifierPart(i);
			// System.out.println(javaLetter+" "+javaLetterAndDigits);
		}

		Box<String, Integer> bi = new Box<String, Integer>("String parameter", 20);

		System.out.println(bi.getV());
	}

}
