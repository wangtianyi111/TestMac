package com.test;

import java.util.*;               //一个类collections类提供基于List的一些静态方法！

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1=new LinkedList();
		for (int i = 0; i < 6; i++) {
			l1.add("a"+i);
		}
		System.out.println(l1);
		System.out.print(l1.get(3)+"     ");
		System.out.println(l1.set(1, "hello"));
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf("a2"));
	    l1.add(1, "a1");
		System.out.println(l1);
		Collections.sort(l1);
		Collections.reverse(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(Collections.binarySearch(l1, "a4"));
		
	}

}
