package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		double p,r,t, i;
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		 System.out.println("enter the value of principle:");
		 p=Double.parseDouble(ob.readLine());
		 
		 System.out.println("enter the value of rate ofv interest:");
		 r=Double.parseDouble(ob.readLine());
		 
		 System.out.println("enter the value of time:");
		 t=Double.parseDouble(ob.readLine());
		 
		 i=(p*r*t)/100;
		 System.out.println("interest amount:"+i);
		 

	}

}
