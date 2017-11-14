package com.test;

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s1=new HashSet();
		Set s2=new HashSet();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s2.add("a");
		s2.add("b");
		s2.add("d");
		Set sn=new HashSet(s1);
		sn.retainAll(s2);
		System.out.println(sn);
		Set su=new HashSet(s2);
		su.addAll(s1);
		System.out.println(su);
		
	}

}
