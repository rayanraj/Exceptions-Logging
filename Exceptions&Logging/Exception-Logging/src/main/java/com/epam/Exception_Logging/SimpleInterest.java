package com.epam.Exception_Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest implements SimpleCompoundInterest {
	private static final Logger LOGGER= LogManager.getLogger(SimpleInterest.class);
	int principle;
	double rate,time;
	
	public SimpleInterest(int principle, double rate, double time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	public double calculateInterest() {
		
		LOGGER.info("This is SimpleInterest Calculator method.");
		double simpleinterest=((principle*rate*time)/100.0);
		return simpleinterest;
	}

}
