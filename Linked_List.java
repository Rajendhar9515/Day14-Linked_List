package com.bridgelabz.linkedlist;

public class Linked_List {
	Node head = null;  // initially we are assigning head as null.
	
	// Ability to create Linked List by adding 30 and 56 to 70 
	public <T> void addFirst(T key) {             
		Node node = new Node(key);           // Adding data at first method.
		node.setKey(key);                       
		node.setNext(head);           //    56 | next ------> 30 | next -------> 70 | next -->null
		head = node;                  //  (added third)     (added second)     (added first)
	}
	
	// printing linked list
	public <T> void print() {
		Node currentNode = head;
		System.out.println("Linked-List :- ");           // head
		while(currentNode != null) {                    // 56|next --> 30|next --> 70|next --> null 
			System.out.print(currentNode.key + " --> ");
			currentNode = currentNode.next;         
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		// Displayed welcome message 
		System.out.println("\t WELCOME TO LINKED LIST \n");
		
		// creating object of Linked_List class 
		Linked_List linkedList = new Linked_List();   
		
		linkedList.addFirst(70);  
		linkedList.addFirst(30);        
		linkedList.addFirst(56);								
		
		linkedList.print();  //printing linkedlist keys/elements/data.
	}	
}
