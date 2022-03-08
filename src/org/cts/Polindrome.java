package org.cts;

public class Polindrome {
	public static void main(String[] args) {
	int c=656;
	int reverse=0;
	while (c>0) {
		int remainder=c%10;
		
		reverse=(reverse*10)+remainder;
		c=c/10;
		
		
	}
	
	System.out.println(reverse);
	
	}	
}
