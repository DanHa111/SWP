package linkedList;

public class DoublyLinkedList {
private DoublyNode head;
	
	public void add(int value) {
		DoublyNode tmp = new DoublyNode(value);
		
		if (head == null) {
			head = tmp;
			return;
		}
		
		DoublyNode it;
		it = head;
		
		while (it.hasNext()) {
			it = it.next();
		}
		
		it.setNext(tmp);
		tmp.setPrev(it);
	}
	
	public void add(int value, int pos) {
		if(head == null && pos != 0)	{
			throw new IllegalArgumentException("List is empty.");
		}
		DoublyNode tmp = head;
		for (int i = 0; i < pos - 1; i++) {
			if(!tmp.hasNext())	{
				throw new IllegalArgumentException("Insert Index out of List Bounds.");
			}
			tmp = tmp.next();
		}
		DoublyNode newDoublyNode = new DoublyNode(value);
		newDoublyNode.setNext(tmp.next());
		tmp.setNext(newDoublyNode);
	}
	
	public void delete(int pos) {
		//TODO: delete DoublyNode
		DoublyNode tmp = head;
		if(pos < 0)	{
			 throw new IllegalArgumentException("pos must be bigger than zero");
		}
		if(pos == 0)	{
			head = tmp.next();
			return;
		}
		for (int i = 0; i < pos - 1; i++) {
			if(!tmp.hasNext())	{
				 throw new IllegalArgumentException("pos greater than listSize(" + i + ")");
			}
			tmp = tmp.next();
		}
		if(!tmp.hasNext())	{
			throw new IllegalArgumentException("pos greater than listSize");
		}
		DoublyNode newNextDoublyNode = tmp.next().next();
		tmp.setNext(newNextDoublyNode);
		newNextDoublyNode.setPrev(tmp);
	}
	
	@Override
	public String toString() {
		String ret = "";
		
		DoublyNode it = head;
		while (it.hasNext()) {
			ret += "" + it.getValue() + " ";
			it = it.next();
		}
		ret += "" + it.getValue() + " ";
		return ret;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(4);
		ll.add(6);
		ll.add(8, 2);
//		ll.delete(1);
		System.out.println(ll);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(4);
//		ArrayList<Integer> pointer = al;
//		for (int i = 0; i < pointer.size(); i++) {
//			System.out.println(pointer.get(i));
//		}
	}
}
