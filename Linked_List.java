package com.bridgelabz.linkedlist;

public class Linked_List {
	Node head = null;  // initially we are assigning head as null.
	
	//Ability to create Linked List by adding 30 and 56 to 70 
	public <T> void addFirst(T key) {             
		Node node = new Node(key);           // Adding data at first method.
		
		node.setNext(head);           //    56 | next ------> 30 | next -------> 70 | next -->null
		head = node;                  //  (added third)     (added second)     (added first)
	}
	
	
	// Ability to create Linked List by appending 30 and 70 to 56. 
	public <T> void append(T key) {
		Node currentNode = head;       // temporary variable taken as head.
		while(currentNode.next != null) {       
			currentNode = currentNode.next;
		}
		Node node = new Node(key);               // 56 | next -------> 30 | next -------> 70 | next ----> null
												//                  (appended to 56)    (appended to 30)						
		currentNode.next = node;
	}

	// Ability to insert 30 between 56 and 70. 
	public <T> void insertBetween(T previous_key , T key) {
		Node currentNode = head;
		while(currentNode.key != previous_key) {
			currentNode = currentNode.next;          //  56 | next  ------>  30 | next------> 70 | next ----> null
		}                                            //(previous_key)    (inserted between)
		Node node = new Node(key);
		node.next = currentNode.next;
		currentNode.next = node;
	}

	// Ability to delete the first element in the LinkedList of sequence 56->30->70.
	public <T> Node popFirst() {
		Node currentNode = head;
		head = head.next;          // changing head from 56 to 30 , so 56 will be null and it will be deleted.
		return currentNode;
	}
	// UC-6 :- Ability to delete the last element in the LinkedList of sequence 56->30->70.
	public <T> void popLast() {
		Node currentNode = head;
		Node previousToLast = null;
		while(currentNode.next != null) {
			previousToLast = currentNode;
			currentNode = currentNode.next;
		}
		previousToLast.next = null;
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
		 
		linkedList.addFirst(56);
		linkedList.append(70);
		linkedList.insertBetween(56, 30);     
		linkedList.popLast();        // deleting the last node        
									
		linkedList.print();  //printing linked list keys/elements/data.
	}
}