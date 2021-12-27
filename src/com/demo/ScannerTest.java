package com.demo;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
	long a, b;
	boolean s;
	
		String name=null;
		System.out.println("enter the name:");
		name=ob.next();
		System.out.println(name);
		System.out.println("enter the value of boolean:");
		s=ob.nextBoolean();
		System.out.println(s);
		
		System.out.println("enter the value a:");
		a=ob.nextLong();
		
		System.out.println("enter the value b:");
		b=ob.nextLong();
		
		System.out.println("addition="+(a+b));
		ob.close();

	}

}
