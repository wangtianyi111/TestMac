package com.test;

public class TestParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d[][];
		String s1="1,2;3,4,5;6,7,8";
		String sfirst[]=s1.split(";");
		d=new double[sfirst.length][];
		for (int i = 0; i < sfirst.length; i++) {
			String ssecond[]=sfirst[i].split(",");
			d[i]=new double[ssecond.length];
			for(int j=0;j<ssecond.length;j++){
				d[i][j]=Double.parseDouble(ssecond[j]);
				System.out.println(d[i][j]);
			}
			
		}
		
		
	}

}
