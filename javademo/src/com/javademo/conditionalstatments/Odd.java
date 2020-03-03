package com.javademo.conditionalstatments;

public class Odd {

	public static void main(String[] args) {
		
		int odd = OddNumbers(50);
	}

public static int OddNumbers(int n) {
	for(int i=0;i<=n;i++) {
		if(i%2 != 0) {
			System.out.println(i);
			
		}
		
	}
	return n;
}
}
