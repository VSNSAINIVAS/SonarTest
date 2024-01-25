package com.zeta.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

// Helper files for logging
public class Helper {
	public static Logger getLogger(Class<?> c){
		// Creating a logger and then returing it
		String path = "config/log4j.properties";
		PropertyConfigurator.configure(path);
		Logger lg = Logger.getLogger(c.getClass());
		return lg;
	}
}
