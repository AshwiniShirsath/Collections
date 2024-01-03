package com.list;

import java.util.ArrayList;

public class Demo_ArrayList {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Ashwini");
		a.add(10);
		a.add("Ashwini");
		a.add(null);
		System.out.println(a);
		
		//...remove 
		a.remove(2);
		System.out.println(a);
		
		a.add(2, "Ash");
		System.out.println(a);
		
		a.add("kalyani");
		System.out.println(a);
		
	}

}
