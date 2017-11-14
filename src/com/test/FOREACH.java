package com.test;

public class FOREACH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]intArray=new int [4][4];
		int k=0;
		for(int i=0;i<intArray.length;i++)
			for(int j=0;j<intArray[i].length;j++){
				intArray[i][j]=k++;
			}
		for(int x[]:intArray)
			for(int y:x){
				System.out.println(y);
			}
				
	
		


	}

}
