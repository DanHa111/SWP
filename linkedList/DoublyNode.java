package linkedList;

public class DoublyNode {
	private int value;
	private DoublyNode next = null;
	private DoublyNode prev = null;
	
	public DoublyNode(int value) {
		this.value = value;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public boolean hasPrev() {
		return prev != null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DoublyNode next() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	
}
