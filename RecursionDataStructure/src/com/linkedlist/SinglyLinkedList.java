package com.linkedlist;

import java.util.Scanner;

public class SinglyLinkedList {
	static NodeSLL head;

	void insertLast() {

		System.out.println("Enter data to be Inserted at last in LinkedList");
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();

		NodeSLL node = new NodeSLL(item);

		if (head == null) {
			head = node;
			System.out.println("Node Created");
		}

		else {
			NodeSLL temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;

		}
		System.out.println("Node inserted");
	}

	void display() {

		if (head == null) {
			System.out.println("Empty LinkedList");

		} else {
			System.out.println("Printing Values.....");
			NodeSLL temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
		System.out.println();
	}

	void reverslogic() {
		System.out.println("Enter data to be Inserted in reverse LinkedList");
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();

		NodeSLL newNode = new NodeSLL(item);
		NodeSLL temp = head;
		// pointer of node which is before temp
		NodeSLL tempBefore = temp;
		temp = temp.next;
		// the pointer of the node which is next to temp
		NodeSLL tempAfter = temp.next;
		/*
		 * here the node pointed by tempBefore is the first node of singly ll, so while
		 * reversing this first node will become last, and next of last in singly ll is
		 * null
		 */
		tempBefore.next = null;
		while (temp != null) {
			temp.next = tempBefore;
			tempBefore = temp;
			temp = tempAfter;
			if (temp != null)
				tempAfter = temp.next;

		}
		head = tempBefore;
		display();
	}

	void recursion(NodeSLL temp) {
		System.out.println("Printing Values using recursion");
		temp = head;
		if (temp !=null) {

		System.out.print(temp.data+" ");
			recursion(temp=temp.next);
		}

		
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.insertLast();
		sll.insertLast();
		sll.insertLast();
		sll.insertLast();
		sll.insertLast();

		sll.display();

		sll.recursion(head);

		// sll.reverslogic();

	}

}

class NodeSLL {
	int data;
	NodeSLL next;

	NodeSLL(int data) {
		this.data = data;
		this.next = null;
	}

}