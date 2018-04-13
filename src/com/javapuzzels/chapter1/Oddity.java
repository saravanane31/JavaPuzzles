package com.javapuzzels.chapter1;

public class Oddity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isOddForPositiveNumber(5));
		System.out.println(isOddForNegativeNumber(-5));
		System.out.println(isOddForAllInteger(-7));
		System.out.println(isOddForAllInteger(7));
		
		/*the divide and remainder operations are slower than arithmatic and logical operations:*/
		
		System.out.println(isOddLogicalOperations(-9));
		System.out.println(isOddLogicalOperations(9));
		System.out.println(isOddLogicalOperations(8));
		System.out.println(isOddLogicalOperations(-8));
		
		operantChecking(8, 9);
	}

	private static boolean isOddForPositiveNumber(int x){
		return x%2 == 1;
	}
	
	private static boolean isOddForNegativeNumber(int x){
		return x%2 == -1;
	}
	
	private static boolean isOddForAllInteger(int x){
		return x%2 != 0;
	}
	
	private static boolean isOddLogicalOperations(int x){
		return (x & 1) !=0;   //any value( -ve or +ve) is logical operation of & 1 i.e.,(x & 1) return 0 if x is even
							 	// and return 1 if x is odd;
	}
	
	private static void operantChecking(int x, int y){
		int tmp = (x/y)*y + (x%y) ;  //(a/b)*b + (a%b) == a; Verified
		System.out.println(tmp==x);
	}
}
