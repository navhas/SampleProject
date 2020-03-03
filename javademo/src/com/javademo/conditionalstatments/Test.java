package com.javademo.conditionalstatments;


public class Test {

	public static void main(String[] args) {

		Multiple m=new Multiple();
		int fact=m.factCalculator(5);
		
		System.out.println("factorial of number="+fact);	
	}
	}
class Multiple{
	public int factCalculator(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
				
			}
		return fact;
	}
}
