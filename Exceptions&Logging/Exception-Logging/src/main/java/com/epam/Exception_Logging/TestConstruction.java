package com.epam.Exception_Logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConstruction {

	private static final Logger LOGGER= LogManager.getLogger(TestConstruction.class);
	
	
	public static void main(String[] args) {
		LOGGER.info("This is tester class for Construction.");
		Scanner sc=new Scanner(System.in);
		LOGGER.info("This is MENU");
			System.out.println("MENU");
			System.out.println("Select Material:");
			System.out.println("	1.Standard Material");
			System.out.println("	2.Above Standard Material");
			System.out.println("	3.High Standard Material");
			System.out.println("Enter your requirements:");
			int material_standard=sc.nextInt();
			
			System.out.println("Enter the square feet:");
			int square_feet=sc.nextInt();
			
			System.out.println("Select Fully Automation:True if Yes or False if No");
			boolean fully_automated=sc.nextBoolean();
			
			HouseConstruction houseConstruction=new HouseConstruction(material_standard, square_feet, fully_automated);
			double total_cost=houseConstruction.calculateCost();
			total_cost=houseConstruction.calculateCostAutomated();
			System.out.println("The total cost is: "+total_cost);
			LOGGER.info("This is the end of tester class.");
	}
}

