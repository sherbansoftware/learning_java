package Java8.Lambda_Expressions.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		

//		Consumer<Integer> consumer = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println();
//
//			}
//		};

//		
//		Consumer<Integer> consumer =(t) -> { 
//				System.out.println();
//		};
//	
//		
//		consumer.accept(10);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(654);
		
		
		
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});

	}

}
