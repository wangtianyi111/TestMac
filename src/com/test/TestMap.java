package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map m1=new HashMap<>();
		m1.put("one", new Integer(1));
		m1.put("four", 5);
		m1.put("two", new Integer(4));
		m1.put("three", new Integer(3));
		Map m2=new HashMap<>();
		m2.put("A", new Integer(1));
		m2.put("B", new Integer(2));
		System.out.println("m1:"+m1);
		System.out.println(m1.size());
		System.out.println(m1.containsKey("one"));
		System.out.println(m1.containsValue(4));
		int i=(int) m1.get("two");
		//int i=(Intger)m1.get("two");
		//Object j=m1.get("two");
		System.out.println("i:"+i);
		Map m3=new HashMap(m1);
		m3.putAll(m2);
		System.out.println(m3);
	}

}
