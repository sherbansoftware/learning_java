package Comparable_Comparator.Comparator_lambda;


import java.util.Comparator;

public class StringCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
