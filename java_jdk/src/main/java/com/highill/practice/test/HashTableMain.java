package com.highill.practice.test;

import java.util.Hashtable;

public class HashTableMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("test1", "data test1");
		// java.lang.NullPointerException key value都不可以为null
		// hashtable.put(null, null);
		hashtable.put("test2", "data test2");
		System.out.println("----- hashtable: " + hashtable);

		hashtable.put("test2", "update test2");
		System.out.println("----- hashtable: " + hashtable);

	}

}
