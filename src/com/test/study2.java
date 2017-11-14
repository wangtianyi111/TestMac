package com.test;

public class study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []intArray={1,23,34,35,54,22,31,28};
		int i,j;
		for(i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		for(i=0;i<intArray.length-1;i++){
			for(j=0;j<intArray.length-i-1;j++){
				if(intArray[j]>intArray[j+1]){
					int temp=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}
			}
		}
		for(i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}

	}

}
