package com;

public class Tutorial4 {

	public Tutorial4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//PHYsics make uppercase into lowercase and lowercase into uppercase
		
		String word = "PHYsics";
		
		String empty = "";
		int l = word.length();
		
		
	for (int i = 0; i < l; i++) {
		
			char letter = word.charAt(i);
			
			if(Character.isUpperCase(letter)) {
				
				empty+=Character.toLowerCase(letter);
			}
			else {
				
				empty+=Character.toUpperCase(letter);
			}
			
	}
		
		System.out.println(empty);
		
		
		
		
	}
	
	
	
}
