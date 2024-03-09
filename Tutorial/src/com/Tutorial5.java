package com;

public class Tutorial5 {

	public static void happyNumber(int x) {
		
	double num = x;
	double number = 0;
	
	int c =0;
	while(number > 1 || number ==0) {
		
	num =number;
	while(num >0 ) {
		
		double rem = num % 10;
		
	
		
 number +=(int) Math.pow(rem,2);
 
 
 num/=10;
 
 
 
	}
		
	
		System.out.println(number);
		
		
	}
	
	
	
	}
	
	public static void main(String[] args) {
		
		happyNumber(13);

	}

}
