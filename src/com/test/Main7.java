package com.test;

import java.util.ArrayList;

public class Main7 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		ArrayList<Integer> bList = new ArrayList<>();
		try {
			while (listNode != null) {
				aList.add(listNode.val);// 直接将int转换为Integer对象？
				listNode = listNode.next;
			}
			for (int i = aList.size() - 1; i >= 0; i--) {
				bList.add(aList.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bList;
	}
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}
