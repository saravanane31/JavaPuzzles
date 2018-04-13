package com.javapuzzels.chapter1;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		
		final long MICROS_PER_DAY1 = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY1 = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY1/MILLIS_PER_DAY1);
	}

}
