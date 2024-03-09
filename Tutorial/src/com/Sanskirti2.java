package com;

public class Sanskirti2 {


	
	public static void main(String[] args) {
		
		int x = 678;//876
		
		int rev=0;
		
		
		
		
		while(x > 0) {
			
			int rem = x % 10;
			
			rev = rev * 10+ rem;
			
			x =x/10;
	
			
			
		}
			
		System.out.println(rev);
		
	}

}
