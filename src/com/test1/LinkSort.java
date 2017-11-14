package com.test1;

import java.util.Scanner;

//没问题，但是牛客网提交过不了
public class LinkSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			int n = scanner.nextInt();
			LinkList h = new LinkList(0);
			LinkList q = h;
			for (int i = 0; i < n; i++) {
				LinkList l = new LinkList(scanner.nextInt());
				q = h;
				for (int j = 0; j < h.n; j++) {
					if (l.n > q.next.n) {
						q = q.next;
					}
				}
				l.next = q.next;
				q.next = l;
				h.n++;
			}
			for (int i = 0; i < n; i++) {
				System.out.print(h.next.n + " ");
				h = h.next;
			}
		}
	}
}

class LinkList{
	int n;
	LinkList next;
	public LinkList(int n) {
		this.n = n;
	}
}