package com.bridgelabz.linkedlist;

public class Linked_List {
	Node<Integer> head = null; // initially we are assigning head as null.

	// printing linked list

	public <T> void print() {
		Node<Integer> currentNode = head;
		System.out.println("Linked-List :- "); // head
		
		while (currentNode != null) { // 56|next --> 30|next --> 70|next --> null
			System.out.print(currentNode.key + " --> ");
			currentNode = currentNode.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		
		// Displayed welcome message
		System.out.println("/t WELCOME TO LINKED LIST /n");

		// creating object of Linked_List class
		Linked_List linkedList = new Linked_List();

		linkedList.head = new Node<Integer>(56); // diagram representation 
		Node<Integer> node2 = new Node<Integer>(30); // linkedList.head
		Node<Integer> node3 = new Node<Integer>(70); //LinkedList.tail
		linkedList.head.next = node2; // 56 | next --> 30 | next --> 70 | next --> null
		node2.next = node3;

		linkedList.print(); // printing linked list keys/elements/data.
	}

}
