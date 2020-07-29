package com.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.log4j.Logger;
//import org.slf4j.LoggerFactory;

public class Client {
	
//	private static Logger log = LoggerFactory.getLogger(Client.class);
	
	private static Logger log = LoggerFactory.getLogger("com.log4j1.Client");
	
	public static void main(String[] args) {
		log.info("i am log4j1....");
	}

}
