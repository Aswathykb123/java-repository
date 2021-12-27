package com.test;

import java.util.Scanner;

public class CondetionalTest {

	public static void main(String[] args) {
		
		int a=23,b=85,c=35;
		Scanner ob=new Scanner(System.in);
		
		System.out.println("enter the value of a");
		a=ob.nextInt();
		System.out.println("enter the value of b");
		b=ob.nextInt();
		System.out.println("enter the value of c");
		c=ob.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println(a+" is a greater valve");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+" is a y valve");
		}
		else
		{
			System.out.println(c+" is a x value");
		}
		
		}
		
	}


