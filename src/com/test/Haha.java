package com.test;

public class Haha {
	public int movingCount(int threshold, int rows, int cols) {
		int count;
		if (rows == 1) {
			int sum;
			count = 0;
			
			String string = "";
			for (int j = 0; j < cols; j++) {
				sum = 0;
				string = String.valueOf(j);
				char[] c = new char[string.length()];
				c = string.toCharArray();
				for (int k = 0; k < c.length; k++) {
					sum += (c[k] - '0');
				}
				if (sum <= threshold) {
					count++;
				}
				if (sum > threshold) {
					break;
				}

			}
		} else if (cols == 1) {
			int sum;
			count = 0;
			for (int i = 0; i < rows; i++) {
				String string = "";
				sum = 0;
				string = String.valueOf(i);
				char[] c = new char[string.length()];
				c = string.toCharArray();
				for (int k = 0; k < c.length; k++) {
					sum += (c[k] - '0');
				}
				if (sum <= threshold) {
					count++;
				}
				if (sum > threshold) {
					break;
				}
			}
		} else {
			int sum;
			count = 0;
			for (int i = 0; i < rows; i++) {
				String string = "";
				for (int j = 0; j < cols; j++) {
					sum = 0;
					string = String.valueOf(i) + String.valueOf(j);
					char[] c = new char[string.length()];
					c = string.toCharArray();
					for (int k = 0; k < c.length; k++) {
						sum += (c[k] - '0');
					}
					if (sum <= threshold) {
						count++;
					}
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Haha h = new Haha();
		System.out.println(h.movingCount(10, 10, 1));
	}
}