package com.test;
import java.util.*;
public class TestArgsWords {

	private static final int ONE=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map  m1=new HashMap<>();
		for (int i = 0; i < args.length; i++) {
			int j=(Integer) m1.get(args[i])==null ? 0:(Integer) m1.get(args[i]);
		    if(j==0){
		    	m1.put(args[i], ONE);
		    
		    }
		    else m1.put(args[i], j+1);
		}
	System.out.println(m1);
	System.out.println(m1.size());
		
	}

}
