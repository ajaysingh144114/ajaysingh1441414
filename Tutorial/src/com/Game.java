package com;

import java.util.*;

public class Game {
	 public static  boolean isPalindrome(int x) {
	        int num = x;
	        int rev = 0;
	        while(num > 0){
	         int rem = num % 10;
	         rev = rev * 10 + rem;
	        num /=10;
	        }
	        System.out.println(rev);
	    if (rev == x)
	    	return true;
	    return false;
	 

	    }
	public static void main(String[] args) {
		
		    boolean x =   isPalindrome(121);
		    
		    System.out.println(x);
		      
		
		
	}

}
