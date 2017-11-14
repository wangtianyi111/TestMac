package com.test;
import java.util.*;
public class BasicGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> s1=new ArrayList<String>();
	s1.add("aaa");s1.add("ccc");s1.add("bbb");
	System.out.println(s1);
	for (int i = 0; i < s1.size(); i++) {
		String s2=s1.get(i);
		System.out.println(s2);
	}
	
	Set<String> c1=new HashSet<>();
	c1.add("aaa");
	c1.add("bbb");
	c1.add("ccc");
	
	for(Iterator<String>it=c1.iterator();it.hasNext();){
		String s=it.next();
		System.out.println(s);
	}
	
	}

}
