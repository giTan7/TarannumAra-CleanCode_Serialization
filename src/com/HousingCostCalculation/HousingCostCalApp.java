package com.HousingCostCalculation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class HousingCostCalApp {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int ch=1;
		do {
			
			bw.write("1:standard material"
					+ "\n2:above standard material"
					+ "\n3:high standard material without automation"
					+ "\n4:high standard material with full automation");
			bw.write("\n\nEnter Your Choice:");
			bw.flush();
			int choice =Integer.parseInt(br.readLine());

			bw.write("enter area of the house in square feet:");
			bw.flush();	
			double area = Double.parseDouble(br.readLine());
		
			if(choice==1) {
				HousingCostCal obj= new HousingCostCal("Standard",area,"No");
				bw.write("price of the house:" + obj.costCal());
				bw.flush();	
			}

			else if(choice==2) {
				HousingCostCal obj= new HousingCostCal("Above Standard",area,"No");
				bw.write("price of the house:" + obj.costCal());
				bw.flush();	
			}
			else if(choice==3){
				HousingCostCal obj= new HousingCostCal("High",area,"No");
				bw.write("price of the house:" + obj.costCal());
				bw.flush();
			}
			else if(choice==4){
				HousingCostCal obj= new HousingCostCal("High",area,"Yes");
				bw.write("price of the house:" + obj.costCal());
				bw.flush();
			}
			else {
				bw.write("ERROR");
				bw.flush();
			}

			bw.write("\n\nPress 0 to EXIT or any other digit to CONTINUE:");
			bw.flush();
			ch=Integer.parseInt(br.readLine());
		}while(ch!=0);

	}	
}
