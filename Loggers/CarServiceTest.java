package Loggers;


import org.junit.Test;




public class CarServiceTest {

	@Test
	public void shouldDemonstrateLogging() throws Exception {
	//	 CarState carState = CarState.DRIVING;
		 
		CarService carService = new CarService();
		carService.process("BMW");
		//CarState[] states= CarState.values();
		// Stream.of(states).forEach(System.out::print);
		//for (CarState c:states) {
		
		//System.out.println("Valid state:" + c);
		//CarService carService = new CarService();
		//carService.process(c.toString());
		//}
	
}
}