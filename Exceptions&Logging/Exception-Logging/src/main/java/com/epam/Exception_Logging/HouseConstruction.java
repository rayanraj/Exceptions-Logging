package com.epam.Exception_Logging;

public class HouseConstruction {
	int material_standard,square_feet;
	boolean fully_automated;
	double total_cost;
	
	public HouseConstruction(int material_standard, int square_feet, boolean fully_automated) {
		super();
		this.material_standard = material_standard;
		this.square_feet = square_feet;
		this.fully_automated = fully_automated;
	}
	
	public double calculateCost() 
	{
		if (material_standard==1) 
		{
			total_cost+=1200*square_feet;
		}
		else if (material_standard==2) 
		{
			total_cost+=1500*square_feet;
		}
		else if (material_standard==3) 
		{
			total_cost+=1800*square_feet;	
		}
		return total_cost; 
	}
	
	public double calculateCostAutomated()
	{
		total_cost= fully_automated ? total_cost + (700 * square_feet) : total_cost;
		return total_cost;
	}
}
