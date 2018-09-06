package com.teamsankya.calculator;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.SimpleLayout;

public class Division {
	private static final Logger LOGGER = Logger.getLogger(Division.class);
	static {
		Layout layout = new SimpleLayout();
		ConsoleAppender consoleAppender = new ConsoleAppender(layout);
		LOGGER.addAppender(consoleAppender);
		try {
			RollingFileAppender rollingFileAppender = new RollingFileAppender(layout,
					"/Users/taurusthebull/Documents/applogger.log");
			LOGGER.addAppender(rollingFileAppender);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int divide(int a, int b) {
		LOGGER.info("dividing 2 int " + a + " " + b);
		return a / b;
	}

	public static long divide(long a, long b) {
		LOGGER.info("dividing 2 long " + a + " " + b);
		return a / b;
	}

	public static double divide(double a, double b) {
		LOGGER.info("dividing 2 double " + a + " " + b);
		return a / b;
	}
}
