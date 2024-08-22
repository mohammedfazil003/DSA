package linkedList;

public class SinglyLL {

	private Node head;
	private Node tail;
	private int size;

	public SinglyLL() {
		this.size = 0;
	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size++;
	}

	public void insertLast(int value) {

		if (tail == null) {
			insertFirst(value);
			return;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;

		size++;

	}

	public void insert(int value, int index) {

		if (index == 0) {
			insertFirst(value);
			return;
		}

		if (index == size) {
			insertLast(value);
			return;
		}

		Node temp = head;

		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	}

	public int deleteFirst() {
		int value = head.value;
		head = head.next;

		if (head == null) {
			tail = null;
		}
		size--;

		return value;
	}

	public int deleteLast() {
		if (size <= 1) {
			return deleteFirst();
		}

		Node node = get(size - 2);
		int value = tail.value;
		tail = node;
		tail.next = null;
		size--;

		return value;
	}

	public int delete(int index) {
		if (index == 1) {
			return deleteFirst();

		}

		if (index == size - 1) {
			return deleteLast();
		}

		Node pre = get(index - 1);
		int value = pre.next.value;
		pre.next = pre.next.next;
		size--;

		return value;
	}

	public Node get(int index) {
		Node node = head;

		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public Node find(int value) {
		Node node = head;
		while (node != null) {
			if (node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	public void display() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");

	}

	private class Node {

		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

	/**
	 *  
	 */
	// remove duplicates from a sorted LL
	// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

	// input : 1 -> 1 -> 2 -> 3 -> 3 -> END
	// output: 1 -> 2 -> 3 -> END
	public void duplicates() {
		Node node = head;

		while (node.next != null) {
			if (node.value == node.next.value) {
				node.next = node.next.next;
				size--;
			} else {
				node = node.next;
			}

		}

		tail = node;
		tail.next = null;
	}

//	public static void main(String[] args) {
//
//		SinglyLL ll = new SinglyLL();
//		ll.insertLast(1);
//		ll.insertLast(1);
//		ll.insertLast(2);
//		ll.insertLast(3);
//		ll.insertLast(3);
//		ll.display();
//
//		ll.duplicates();
//		ll.display();
//
//	}

	public static SinglyLL merge(SinglyLL first, SinglyLL second) {

		Node f = first.head;
		Node s = second.head;

		SinglyLL ans = new SinglyLL();

		while (f != null && s != null) {
			if (f.value < s.value) {
				ans.insertLast(f.value);
				f = f.next;
			} else {
				ans.insertLast(s.value);
				s = s.next;
			}
		}
		while (f != null) {
			ans.insertLast(f.value);
			f = f.next;
		}

		while (s != null) {
			ans.insertLast(s.value);
			s = s.next;
		}

		return ans;

	}

	public static void main(String[] args) {

		SinglyLL l1 = new SinglyLL();
		l1.insertLast(1);
		l1.insertLast(3);
		l1.insertLast(5);

		SinglyLL l2 = new SinglyLL();
		l2.insertLast(1);
		l2.insertLast(2);
		l2.insertLast(9);

		SinglyLL list = merge(l1, l2);
		list.display();
	}

}
