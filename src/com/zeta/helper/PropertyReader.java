package com.zeta.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("config/log4j.properties");
			Properties p = new Properties();
			p.load(fr);
			System.out.println(p.getProperty("log4j.rootLogger"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
