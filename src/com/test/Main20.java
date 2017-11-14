package com.test;


//ΪʲôLinkedList��getFirst()�����ᱨ����������������

import java.util.LinkedList;
import java.util.Scanner;

public class Main20 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String s1 = scanner.nextLine();
			String[] strings1 = s1.split("\\ ");
			int n = Integer.parseInt(strings1[0]);
			int[] a1 = new int[n * 2];
			for (int i = 0; i < a1.length; i++) {
				a1[i] = Integer.parseInt(strings1[i+1]);
			}
			String s2 = scanner.nextLine();
			String[] strings2 = s2.split("\\ ");
			int m = Integer.parseInt(strings2[0]);
			int[] a2 = new int[m * 2];
			for (int i = 0; i < a2.length; i++) {
				a2[i] = Integer.parseInt(strings2[i+1]);
			}
			//System.out.println(a1.length);
			//System.out.println(a2.length);
			sort(a1, a2);
		}
	}

	public static void sort(int[] a, int[] b) {
		LinkedList<Linknode> h1 = builtLink(a);
		LinkedList<Linknode> h2 = builtLink(b);
		LinkedList<Linknode> l3 = new LinkedList<>();
		
		System.out.println(h1.getFirst().x == 1);
		System.out.println(h2.getFirst().x);
		
		
		while (h1 != null && h2 != null) {
			Linknode n = h1.getFirst();
			Linknode m = h2.getFirst();
			if (n.y < m.y) {
				l3.add(h2.getFirst());
				h2.remove();
			}
			if (n.y > m.y) {
				l3.add(h1.getFirst());
				h1.remove();
			}
			if (n.y == m.y) {
				Linknode l = new Linknode(h1.getFirst().x + h2.getFirst().x, h1.getFirst().y);
				l3.add(l);
				h1.remove();
				h2.remove();
			}
		}

		while(h2 != null) {
			l3.add(h2.getFirst());
			h2.remove();
		}
		while(h1 != null) {
			l3.add(h1.getFirst());
			h1.remove();
		}

		
		 while(l3 != null){
			 System.out.println(l3.getFirst().x + " " + l3.getFirst().y);
			 l3.remove();
		}
		 

		/*while (l1 != null) {
			System.out.println(l1.x + " " + l1.y);
			l1 = l1.next;
		}*/
		//System.out.println(h3.x);
	}
	
	
	
	public static LinkedList<Linknode> builtLink(int[] a){
		LinkedList<Linknode> p = new LinkedList<>();
		
		for (int i = 0; i < a.length; i = i + 2) {
			Linknode l = new Linknode(a[i], a[i + 1]);
			p.add(l);
			
		}
		
		return p;
	}

}

class Linknode {
	int x;
	int y;

	public Linknode(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
