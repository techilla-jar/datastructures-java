package com.whiskeycoder.datastructures.linkedlist;

public class LinkedListApp {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new LinkedList<Integer>();
		
		intList.insert(10);
		intList.insert(17);
		intList.insert(43);
		intList.insert(99);
		
		intList.traverseList();
		
		System.out.println("\n" + intList.size());
	}

}
