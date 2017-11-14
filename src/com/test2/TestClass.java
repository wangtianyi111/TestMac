package com.test2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestClass {
	public static void main(String[] args) {
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(1, new Person("aa", 12));
		Set set = map.keySet();
		System.out.println(map.getClass());
		System.out.println(map.keySet());
		System.out.println(set.getClass());
		System.out.println(map.values());
		System.out.println(map.values().getClass());
	}
	
	
}

class Person implements Serializable{
	String name;
	int age;
	public Person(String name,int age) {
		this.age = age;
		this.name = name;
	}
}
