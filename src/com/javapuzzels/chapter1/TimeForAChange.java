package com.javapuzzels.chapter1;

import java.math.BigDecimal;

public class TimeForAChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2.00 - 1.10);
		System.out.println(Double.toString(2.00 - 1.10));
		System.out.printf("%.2f%n",2.00-1.10);
		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));
		
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}

}
