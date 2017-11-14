package com.test;

public class study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []intArray={1,23,34,35,54,22,31,28};
		int i,j;
		for(i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		for(i=0;i<intArray.length-1;i++){
			for(j=i+1;j<intArray.length;j++){
				if(intArray[i]>intArray[j]){
					int temp=intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		for(i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}

	}

}
