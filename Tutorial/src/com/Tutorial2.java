package com;


public class Tutorial2 {

	public Tutorial2() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		//this is programming about finding max and min
		
		int [] arr = {5,3,4,7,9};
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if(min> arr[i]) {
				
				 min = arr[i];
				 
			}
			
		}
		System.out.println(min);
	}
	
}
