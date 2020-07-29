package com.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client2 {
	
	private static Logger log = LoggerFactory.getLogger(Client.class);
	
	
	public static void main(String[] args) {
		log.info("i am log4j1....");
	}

}
