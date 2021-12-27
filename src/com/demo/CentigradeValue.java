package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CentigradeValue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double f,c;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		 System.out.println("enter the value of centigrade value:");
		 c=Double.parseDouble(ob.readLine());
		 
		 f=(c*(1.8)+32);
		 
		 System.out.println("centigrade value=:"+f);
		 

	}

}
