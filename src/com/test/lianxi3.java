package com.test;

public class lianxi3 {
	
	public static void main(String[] args){
		 int count=0;
		 for(int i=101;i<=200;i++){
			 for(int j=2;j<=Math.sqrt(i);j++){
				 if((i%j)==0){
					 break;
				}
				 if(j>Math.sqrt(i)){
					 System.out.println(i);
					 count++;
				 }
			 }
		 }
		 System.out.println(count);
	}

}
