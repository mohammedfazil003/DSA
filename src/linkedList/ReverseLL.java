/**
 * Reverse a Linked List
 */
package linkedList;

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}
}

public class ReverseLL {

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		Node node = head;
		Node prev = null;
		while (node != null) {
			Node temp = node.next;
			;
			node.next = prev;
			prev = node;
			node = temp;
		}

		head = prev;

		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
	}

}
