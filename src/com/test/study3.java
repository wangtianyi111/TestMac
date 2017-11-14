package com.test;

public class study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []intArray={1,23,34,35,54,22,31,28};
		int i,j,index,temp,k;
		for(i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		for(i=0;i<intArray.length;i++){
			index=i;
			k=intArray[i];
			for(j=i;j<intArray.length;j++)
				if(intArray[j]<k){
					index=j;
					k=intArray[j];
				}
			temp=intArray[index];
			intArray[index]=intArray[i];
			intArray[i]=temp;
		}
		for(i=0;i<intArray.length;i++){
			System.out.print(intArray[i]+" ");
		}

	}

}
