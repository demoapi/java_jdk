package com.highill.practice.test;

import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Properties properties = new Properties();

		properties.put("test1", "data test1");
		properties.put("test2", "data test2");

		System.out.println("----- properties: " + properties);

		properties.put("test2", "update test2");
		System.out.println("----- properties: " + properties);

	}

}
