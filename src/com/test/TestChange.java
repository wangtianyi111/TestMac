package com.test;

public class TestChange {           //fail

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="1,2;3,4;5,6,7";
		TestChange tc=new TestChange();
		tc.reverseString(s1);
		
	}
	public double reverseString(String s){
		double a[][]=new double[10][];
		char c;
		int j=0,k=0;
		for (int i = 0; i < s.length(); i++) {
			c=s.charAt(i);
			if (c>='0'&&c<='9') {
				a[j][k]=(double)c;
				k++;
			}
			else if(c==';'){
				j++;
			}
		for(int m =0;m<a.length;m++){
			for(int n=0;n<a[m].length;n++){
				System.out.println(a[m][n]);
			}
		}		
		}
		return 0;
		}
	

}
