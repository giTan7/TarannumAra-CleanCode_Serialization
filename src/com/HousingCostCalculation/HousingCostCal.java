package com.HousingCostCalculation;

public class HousingCostCal {
	
	String materialStandard,automation;
	double area;
	
	/*
	 * param materialStandard, area, automation
	 */
	HousingCostCal(String materialStandard,double area, String automation){
		System.out.println("Welcome to Housing Cost Calculator");
		this.materialStandard=materialStandard;
		this.area=area;
		this.automation=automation;
	}
	
	
	public double costCal(){
		if(materialStandard=="Standard"){
			return 1200*area;
			}
		else if(materialStandard=="Above Standard"){
			return 1500*area;
			}
		else if(materialStandard=="High" && automation=="No"){
			return 1800*area;
			}
		else if(materialStandard=="High" && automation=="Yes"){
			return 2500*area;
			}
		else{
			return 0;
			}
}
}
