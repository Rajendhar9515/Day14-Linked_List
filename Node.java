package com.bridgelabz.linkedlist;

public class Node<T> {
	
	T key; // key/Data with Generic type.
	Node<T> next = null; // initially next assigned as null.

	// Constructor
	public Node(T key) {
		this.key = key;
		this.next = next;
	}

	// Getters and Setters
	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
