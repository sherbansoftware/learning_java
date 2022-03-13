package Loggers;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

public class MainLogger {

	public static void main(String[] args) {
		// assume SLF4J is bound to logback in the current environment
		  LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		  // print logback's internal status
		  StatusPrinter.print(lc);
	}

}
