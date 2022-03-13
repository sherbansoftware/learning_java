package Miscelanous;


import java.util.Arrays;
import java.util.List;

public class WildCard {
public static void main(String[] args) {
	
	List<Integer> listInteger= Arrays.asList(2,88,765,94);
	
	List<String> listString=Arrays.asList("String1","String2","String3");
	
	printList(listInteger);
	printList(listString);
}
	public static void printList(List<?> list) {
		
	for (Object s:list) {
	System.out.println(s+" ");
		
	}	
		
	}
}
