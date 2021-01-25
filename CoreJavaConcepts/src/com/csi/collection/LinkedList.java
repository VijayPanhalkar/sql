package com.csi.collection;

public class LinkedList {
	public static void main(String[] args) {
		
		
		java.util.LinkedList<String> li = new java.util.LinkedList<>();
		
		li.add("raman");
		li.add("kamal");
		li.add("ram");
		li.add("pavan");
		li.add("shravan");
		li.add("ram");
		
		li.forEach(System.out::println);
	}

}
