package com.IntrestCalculation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * author @Tarannum Ara
 */

public class InterestCal {
	double principal,rateOfInterest,years;

	void takeInput()throws IOException{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		principal=Double.parseDouble(br.readLine());
		rateOfInterest=Double.parseDouble(br.readLine());
		years=Double.parseDouble(br.readLine());

	}
}

class Calculation extends InterestCal{

	double SIcalculate() {
		double si = principal*rateOfInterest*years/100;
		return si;
	}

	double CIcalculate() {
		double ci = principal*(Math.pow((1+rateOfInterest/100),years))-principal;
		return ci;
	}

	void show()throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));	

		bw.write("\nsimple interest: "+SIcalculate());
		bw.write("\ncompund interest: "+CIcalculate());
		bw.flush();
	}

}

