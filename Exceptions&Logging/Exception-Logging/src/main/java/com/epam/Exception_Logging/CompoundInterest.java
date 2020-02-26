package com.epam.Exception_Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest implements SimpleCompoundInterest {
	private static final Logger LOGGER= LogManager.getLogger(CompoundInterest.class);
	int principle;
	double rate,time;
	
	public CompoundInterest(int principle, double rate, double time) {
		super();
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	public double calculateInterest() {
		LOGGER.info("This is CompoundInterest calculation method");
		double compoundinterest=principle*(Math.pow(1+(rate/100), time));
		return compoundinterest;
	}


}
