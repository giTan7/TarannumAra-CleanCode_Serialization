package com.IntrestCalculation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IntrestCalApp {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Calculation obj = new Calculation();
		
		bw.write("Welcome to Interest Calculator Application");
		bw.flush();
		int ch = 1;
		do{
			bw.write("\nenter principle, rate, time:\n");
			bw.flush();

			obj.takeInput();
			obj.SIcalculate();
			obj.CIcalculate();
			obj.show();
			
			bw.write("\n\nPress 0 to EXIT or any other digit to CONTINUE:");
			bw.flush();
			ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
		
	}
}
