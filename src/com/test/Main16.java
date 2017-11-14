package com.test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a,b;
		int sum;
		while(scanner.hasNext()){
			a = scanner.next();
			b = scanner.next();
			String[] s1 = a.split("\\,");
			String[] s2 = b.split("\\,");
			a = "";
			b = "";
			for (int i = 0; i < s1.length; i++) {
				a = a + s1[i];
			}
			for (int j = 0; j < s2.length; j++){
				b = b + s2[j];
			}
			sum = Integer.parseInt(a) + Integer.parseInt(b);
			
			System.out.println(sum);
			
		}
	}
	
	

}
