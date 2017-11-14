package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Main12 {
	

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int num = scanner.nextInt();
			int[] array = new int[num];
			for (int i = 0; i < array.length; i++) {
				array[i] = scanner.nextInt();
			}
			SortBT node = new SortBT(array[0]);
			for (int i = 1; i < array.length; i++) {
				cSBt(node, array[i]);
			}
			pre(node);
			System.out.println();
			in(node);
			System.out.println();
			late(node);
			System.out.println();
		}
	}
	
	public static SortBT cSBt(SortBT node, int val) {
		if (node == null || node.val == val) {
			node = new SortBT(val);
		} else if (val < node.val) {
			node.left = cSBt(node.left, val);
		} else if (val > node.val) {
			node.right = cSBt(node.right, val);
		}
		
		return node;
	}
	
	public static void pre(SortBT node){
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		pre(node.left);
		pre(node.right);
	}
	
	public static void in(SortBT node){
		if (node == null) {
			return;
		}
		in(node.left);
		System.out.print(node.val + " ");
		in(node.right);
	}
	
	public static void late(SortBT node){
		if (node == null) {
			return;
		}
		late(node.left);
		late(node.right);
		System.out.print(node.val + " ");
	}
}

class SortBT {
	int val;

	SortBT left, right;

	public SortBT(int val) {
		this.val = val;
	}
}




























