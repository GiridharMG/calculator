package com.teamsankya.calculator;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.SimpleLayout;

public class Addition {
	private static final Logger LOGGER = 
								Logger.getLogger(Addition.class);
	static {
		ConsoleAppender consoleAppender = new ConsoleAppender();
		LOGGER.addAppender(consoleAppender);
		Layout layout = new SimpleLayout();
		try {
			RollingFileAppender rollingFileAppender = 
					new RollingFileAppender(layout, "/Users/taurusthebull/Documents/applogger.log");
			LOGGER.addAppender(rollingFileAppender);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int add(int a, int b) {
		LOGGER.info("adding 2 int "+a+" "+b);
		return a + b;
	}
	public static long add(long a, long b) {
		LOGGER.info("adding 2 long "+a+" "+b);
		return a + b;
	}
	public static double add(double a, double b) {
		LOGGER.info("adding 2 double "+a+" "+b);
		return a + b;
	}
	
}
