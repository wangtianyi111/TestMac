package com.test;

import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Stack;

import javax.crypto.spec.PSource;

public class Main10 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		int pos = -1;
		TreeNode treeNode = new TreeNode(pre[0]);
		if (pre.length != 0) {
			for (int i = 0; i < in.length; i++) {
				if (in[i] == pre[0]) {
					pos = i; // 也就是左子树的长度
					break;
				}
			}
			if (pos != 0) {
				int[] a = new int[pos];
				int[] b = new int[pos];
				for (int i = 0, j = 1; i < pos; i++, j++) {
					a[i] = pre[j];
				}
				for (int i = 0; i < pos; i++) {
					b[i] = in[i];
				}
				treeNode.left = reConstructBinaryTree(a, b); // 左子树
			}
			if (pre.length - 1 - pos != 0) {
				int[] c = new int[pre.length - 1 - pos];
				int[] d = new int[in.length - 1 - pos];
				for (int i = 0, j = pos + 1; i < pre.length - 1 - pos; i++, j++) {
					c[i] = pre[j];
				}
				for (int i = 0, j = pos + 1; i < pre.length - 1 - pos; i++, j++) {
					d[i] = in[j];
				}
				treeNode.right = reConstructBinaryTree(c, d); // 右子树
			}
		}
		return treeNode;
	}

	/*
	 * public static int Fibonacci(int n) { BigInteger sum = new
	 * BigInteger("0"); if (n == 1 || n == 2) { sum = BigInteger.valueOf(1); }
	 * else { sum = BigInteger.valueOf(Fibonacci(n -
	 * 1)).add(BigInteger.valueOf(Fibonacci(n - 2))); } return sum.intValue(); }
	 */

	// 用迭代的方法来求斐波那契数列！！
	public static int Fibonacci(int n) {
		int prenum = 1;
		int preprenum = 0;
		int result = 0;
		if (n == 1) {
			result = 1;
		}
		for (int i = 2; i <= n; i++) {
			result = prenum + preprenum;
			preprenum = prenum;
			prenum = result;
		}
		return result;
	}

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		solution.push(1);
		solution.push(2);
		solution.push(3);
		System.out.println(solution.pop());
		System.out.println(solution.pop());
		solution.push(4);
		System.out.println(solution.pop());
		solution.push(5);
		System.out.println(solution.pop());
		System.out.println(solution.pop());
	}

}

class Solution1 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack2.isEmpty() == false) {
			return stack2.pop();
		}
		else{
			while (stack1.isEmpty() == false ) {
				stack2.push(stack1.pop());
			}
		}
		
		return stack2.pop();
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
