package Loggers;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

	private static Logger logg = LoggerFactory.getLogger(CarService.class);

	@Test
	public void process(String input) {
		logg.info("Processing car: {}", input);
	}
}
