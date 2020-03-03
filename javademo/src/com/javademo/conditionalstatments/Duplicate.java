package com.javademo.conditionalstatments;

public class Duplicate {

	public static void main(String[] args) {
		String s="Anilchand";
		
		
		
		for(int i = 0; i < s.length(); i++) {
			
			boolean dupFound = false;
			
			for (int j = 0; j < s.length(); j++) {
			   if(i != j && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
				   dupFound = true;
			   }
			}
			
			if(dupFound == false) {
				System.out.print(s.charAt(i));
			}
			
		}

}
}
