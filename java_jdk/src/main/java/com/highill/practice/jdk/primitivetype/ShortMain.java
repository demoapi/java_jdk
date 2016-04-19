package com.highill.practice.jdk.primitivetype;

public class ShortMain {

	public static void main(String[] args)
	{
		short s1 = 100;
		System.out.println("----- ----- s1=" + s1);

		// Type mismatch: cannot convert from int to short
		s1 = (short) (s1 + 1);
		System.out.println("----- ----- s1=" + s1);

		s1 += 1;
		System.out.println("----- ----- s1=" + s1);

	}

}
