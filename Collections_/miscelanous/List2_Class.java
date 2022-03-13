package Collections_.miscelanous;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class List2_Class {
	public static void main(String[] args) {
		List<Integer> intl = Arrays.asList(4, 88, 94, 66, 954);

		intl.get(0);

		//intl.set(0, 88);
		//intl.add(2,88);
		Collections.sort(intl);// exception
		System.out.println(intl);
	}
}