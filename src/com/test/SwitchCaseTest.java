package com.test;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int a;
		System.out.println("enter the number betwee n 1 to 7");
		a=ob.nextInt();
		
		switch(a)
		{

		case 1: System.out.println("it sunday");
		break;
		case 2: System.out.println("it sun");
		break;
		case 3: System.out.println("it sund");
		break;
		case 4: System.out.println("it moday");
		break;
		case 5: System.out.println("it tues");
		break;
		case 6: System.out.println("it wed");
		break;
		case 7: System.out.println("it thus");
		break;
		default:System.out.println("wrong");
		}
		
		}

	}


