package com.test;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int JumpFloor(int target) {
        int sum;
		if(target == 1){
            sum = 1;
        }
        else if(target == 2){
            sum = 2;
        }
        else{
            sum = JumpFloor(target - 1 ) + JumpFloor(target - 2);
        }
        return sum;
    }

}
