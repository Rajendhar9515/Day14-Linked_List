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
	// UC-7 :- Ability to search LinkedList to find Node with value 30. 
	public <T> boolean search(T key) {
		Node currentNode = head;
		while(currentNode != null) {                               
			if(currentNode.key == key) {                                 // 56 | next --> 30 | next
				System.out.println("\n\nNode :- " + currentNode.key);   //   (head)        (found)
				return true;
			}
			currentNode = currentNode.next;
		}
		System.out.println("\n\nNode not found");
		return false;
	}
	// UC-8 :- Ability to insert 40 after 30 to the Linked List sequence of 56->30->70. 
	public <T> boolean searchAndInsert(T previous_key , T insert_key) {
		Node currentNode = head;
		while(currentNode != null) {
			if(currentNode.key.equals(previous_key)) {
				insertBetween(previous_key , insert_key);      // calling method to insert node.
			}                                                 // 56|next---->30|next----> 40|next---->70|next---->null
			currentNode = currentNode.next;					 //           (found key)   (inserted)
		}
		return false;
	}

	//UC-9 :- Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
	public <T> boolean DeleteByKey(T key) {
		Node currentNode = head;
		Node previousNode = head;
		while(currentNode != null) {
			if(currentNode.key == key) {
				previousNode.next = currentNode.next;         // 56|next---->30|next---->40|next----70|next---->null
				size(); 									//                   (40 found & deleted)
				return true;                                //   56|next-->30|next-->70|next-->null 
			}												
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
		return false;
	}
	
	public <T> void size() {
		Node curreNode = head;
		int count = 0;
		while(curreNode != null) {             // counting size of the linked list.
			count++;
			curreNode = curreNode.next;
		}
		System.out.println("Size of the Linked List :- " + count);
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
		linkedList.searchAndInsert(30, 40);
		linkedList.DeleteByKey(40);

		
		linkedList.print();  //printing linked list keys/elements/data.
	}
}