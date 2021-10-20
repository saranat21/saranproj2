package org.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
	
	static String s1;
	
	public static void main(String[] args) {
		
		//ArithmeticException
		Scanner s = new Scanner(System.in);
		System.out.println("enter divisible number");
		int j = s.nextInt();
		
		try{
		System.out.println(10/j);
		}catch(ArithmeticException e){ // catch part will be execute only if exception occurs
			
			System.out.println("Arithmetic exception occurred , you are trying to divide that number by zero");
			e.printStackTrace();
			
		}
		
		finally { // it will be executed if exception occur or not and it is optional
			
			System.out.println("default");
			
		}
		
			
		System.out.println("continue");
		int a = 100,b = 200;
		
		System.out.println(a+b);
		
	}
	
}
