package com.zeta.atomic;

import org.apache.log4j.Logger;

public class Log4Test {
	public static void main(String[] args) {
		Logger lg = Logger.getLogger(Log4Test.class);
		lg.debug("First message");
		lg.warn("");
		lg.info("");
		lg.error("");
		lg.fatal("");
	}

}
 	