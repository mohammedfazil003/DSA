package linkedList;

public class DoublyLL {

	private Node head;

	public void inserFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}

		head = node;

	}

	public void display() {

		Node node = head;

		while (node != null) {
			System.out.print(node.value + "--> ");
			node = node.next;
		}

		System.out.println();
	}

	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

		public Node(int value) {
			super();
			this.value = value;
		}

	}

}
