package com.test;

public class Solution {

	public static void main(String[] args) {

	}

	public boolean Find(int target, int[][] array) {
		try {
			for (int i = 0; i < array.length; i++) {
				if (target < array[i][array[i].length - 1]) {
					for (int j = 0; j < array[i].length; j++) {
						if (array[i][j] == target) {
							return true;
						}
					}
				} else if (target == array[i][array[i].length - 1]) {
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			return false;
		}

	}

}
