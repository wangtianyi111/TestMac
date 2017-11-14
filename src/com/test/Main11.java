package com.test;

public class Main11 {

	public static void main(String[] args) {
		/*
		 * int[] array = { 1, 2, 3, 4, 5, 6, 7 }; Main11 m = new Main11();
		 */
		// m.reOrderArray(array);

		int[] a = { 34, 8, 64, 51, 32, 21 };
		insertSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	/*
	 * public void reOrderArray(int[] array) { int[] a = new int[array.length];
	 * 
	 * for (int i = 0, j = 0; i < array.length; i++) { if (array[i] % 2 == 1) {
	 * a[j++] = array[i]; } }
	 * 
	 * for (int i = array.length - 1, j = array.length - 1; i >= 0; i--) { if
	 * (array[i] % 2 == 0) { a[j--] = array[i]; } } for (int i = 0; i <
	 * a.length; i++) { array[i] = a[i]; } }
	 */

	/*
	 * public ListNode1 ReverseList(ListNode1 head) { if (head == null) { return
	 * null; } ListNode1 h = new ListNode1(head.val); h.next = null;
	 * 
	 * while(head.next != null){ head = head.next; ListNode1 p = new
	 * ListNode1(head.val); p.next = h; h= p; } return h; }
	 */

	public static int[] insertSort(int[] array) {
		int j;
		for (int p = 1; p < array.length; p++) {
			int tmp = array[p];
			for (j = p; j > 0 && tmp < array[j - 1]; j--) {
				array[j] = array[j - 1];
			}
			array[j] = tmp;
		}
		return array;
	}

}

/*
 * class ListNode1{ int val; ListNode1 next = null;
 * 
 * ListNode1(int val){ this.val = val; } }
 */
