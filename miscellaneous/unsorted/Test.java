package miscellaneous.unsorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		int[] a = { 4, 8, 6, 7, -4, 45, 95, 41, 9798 };

		List<Integer> list = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
		Integer maxim = Arrays.stream(a).max().getAsInt();

		int size = a.length;
		int max = a[a.length - 1];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
		}
		
	//	System.out.println("Maximus--------------- "+ maxim);


//		String s = "this is a long sentence";
//		int i = s.indexOf('i'); // the first 'i' in String is at index 2
//		int j = s.indexOf("th"); // the index of the first occurrence of "long" in s is 10
//		int k = s.indexOf('z'); // k is -1 because 'z' was not found in String s
//		int h = s.indexOf("LoNg"); // h is -1 because "LoNg" was not found in String s	
		
//		String s1 = "Cat";
//		String s2 = new String("Cat").intern();
//		if(s1 == s2) {
//			System.out.println("Strings are equals");
//			} 
		
//		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
//		String[] dataCells = lineFromCsvFile.split(";");
//		String s = "a|b|c";
//		String[] arr = s.split("\\|");
//		
//		String data ="Ma duc  la  plimbare       acum!";
//		String[] split = data.split("\\s+");
		
		//String[] split = s.split("\\|");
		
//		String str = "the lazy fox jumped over the brown fence";
//		StringTokenizer tokenizer = new StringTokenizer(str);
//		while (tokenizer.hasMoreTokens()) {
//		 System.out.print(tokenizer.nextToken()+" ");
//		}

//		String str = "jum_ped over and jum_ped quick";
//		// In this case character `u` and `e` will be used as delimiters
//		StringTokenizer tokenizer = new StringTokenizer(str, "_");
//		while (tokenizer.hasMoreTokens()) {
//		 System.out.print(tokenizer.nextToken());
//		}
		
//		String[] elements = { "foo", "bar", "foobar" };
//		String singleString = String.join(" ",elements);
//		System.out.println(singleString); // Prints "foo + bar + foobar" 
	
		
	//	StringJoiner sj = new StringJoiner(", ", "<", ">");
		 // The last two arguments are optional,
		 // they define prefix and suffix for the result string
//		sj.add("foo");
//		sj.add("bar");
//		sj.add("foobar");
//		System.out.println(sj); // Prints "[foo, bar, foobar]"
		
//		StringBuilder sb = new StringBuilder("");
//		sb.append("str").append("uygyugyuiting");
//      System.out.println(sb);
		
		 
		
		//System.out.println("Display: " );
		
		

//		String s = "this is a long sentence";
//		int i = s.indexOf('i'); // the first 'i' in String is at index 2
//		int j = s.indexOf("th"); // the index of the first occurrence of "long" in s is 10
//		int k = s.indexOf('z'); // k is -1 because 'z' was not found in String s
//		int h = s.indexOf("LoNg"); // h is -1 because "LoNg" was not found in String s	
		
//		String s1 = "Cat";
//		String s2 = new String("Cat").intern();
//		if(s1 == s2) {
//			System.out.println("Strings are equals");
//			} 
		
//		String lineFromCsvFile = "Mickey;Bolton;12345;121216";
//		String[] dataCells = lineFromCsvFile.split(";");
//		String s = "a|b|c";
//		String[] arr = s.split("\\|");
//		
//		String data ="Ma duc  la  plimbare       acum!";
//		String[] split = data.split("\\s+");
		
		//String[] split = s.split("\\|");
		
//		String str = "the lazy fox jumped over the brown fence";
//		StringTokenizer tokenizer = new StringTokenizer(str);
//		while (tokenizer.hasMoreTokens()) {
//		 System.out.print(tokenizer.nextToken()+" ");
//		}

//		String str = "jum_ped over and jum_ped quick";
//		// In this case character `u` and `e` will be used as delimiters
//		StringTokenizer tokenizer = new StringTokenizer(str, "_");
//		while (tokenizer.hasMoreTokens()) {
//		 System.out.print(tokenizer.nextToken());
//		}
		
//		String[] elements = { "foo", "bar", "foobar" };
//		String singleString = String.join(" ",elements);
//		System.out.println(singleString); // Prints "foo + bar + foobar" 
	
		
	//	StringJoiner sj = new StringJoiner(", ", "<", ">");
		 // The last two arguments are optional,
		 // they define prefix and suffix for the result string
//		sj.add("foo");
//		sj.add("bar");
//		sj.add("foobar");
//		System.out.println(sj); // Prints "[foo, bar, foobar]"
		
//		StringBuilder sb = new StringBuilder("");
//		sb.append("str").append("uygyugyuiting");
//      System.out.println(sb);
		
		//System.out.println("Display: " );
	
	 // System.out.print("overflow produces infinity: ");
    // System.out.println(d + "*10==" + d*10);	
		//Point point =new Point(max, max);
	  //  Point p = new Point();
      
		// System.out.println(p.X);
		 
		
		
	}
}
