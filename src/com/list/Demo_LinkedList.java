package com.list;

import java.util.LinkedList;

public class Demo_LinkedList {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("Ashwini");
		a.add(10);
		a.add("Ashwini");
		a.add(null);
		System.out.println(a);

		a.addFirst("Trupti");
		System.out.println(a);

		a.addLast("Chetna");
		System.out.println(a);

		System.out.println(a.getFirst());
		System.out.println(a.getLast());

		a.removeFirst();
		System.out.println(a);
		a.removeLast();
		System.out.println(a);
		
		a.set(2, "Ash");
		System.out.println(a);

	}

}
