package com.bridgelabz.linkedlist;


// UC-10 :- Ability to create Ordered Linked List in ascending order of data entered in following sequence 56, 30, 40, and 70. 
public class Sorted_Linked_List<T>{
	Node head = null;
	
	// add node to the linked list 
	public void addNode(T key) {
		Node newNode = new Node(key);
		newNode.setNext(head);          
		head = newNode;
	}
		
	// sorting the linked list 
	public void sort() {
		Node currentNode = head , nextNode = null;
		
		int temp_node;
		if(head == null) {
			return;
		}
		else {
			while(currentNode != null) {
				nextNode = currentNode.next;    //next node point next to current node.
			
				while(nextNode != null) {        
					if(((int)currentNode.key) > ((int)nextNode.key)) {
						temp_node = (int)currentNode.key;      // swaps key if currentNode.key is greater than nextNode.key   
						currentNode.key = nextNode.key;		    //  i.e., currentNode.key becomes nextNode.key and vice-versa
						nextNode.key = temp_node;               // here , temp_node refers currentNode.key
					}
					nextNode = nextNode.next;
				}
				currentNode = currentNode.next;
				
			}
			display();          // calling display method.
		}
	}
	// display method 
	public void display() {
		Node currentNode = head;
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(currentNode != null) {
			System.out.print(currentNode.key + "  ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
