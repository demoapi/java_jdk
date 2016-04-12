package com.highill.practice.test;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		HashMap<String, String> mapTest = new HashMap<String, String>();

		mapTest.put("test1", "data test1");
		mapTest.put(null, null);
		mapTest.put("test2", "data test2");

		System.out.println("----- mapTest: " + mapTest);

		mapTest.put(null, "null data");
		mapTest.put("test2", "update test2");
		System.out.println("----- mapTest: " + mapTest);

	}

}
