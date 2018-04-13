package com.javapuzzels.chapter1;

public class JoyOfHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));  //it is generally best to avoid mixed-type computations
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
	}

}
