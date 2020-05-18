package linkedList;

public class LinkedList {
	private Node head;
	
	public void add(int value) {
		Node tmp = new Node(value);
		
		if (head == null) {
			head = tmp;
			return;
		}
		
		Node it;
		it = head;
		
		while (it.hasNext()) {
			it = it.next();
		}
		
		it.setNext(tmp);
	}
	
	public void add(int value, int pos) {
		if(head == null && pos != 0)	{
			throw new IllegalArgumentException();
		}
		Node tmp = head;
		for (int i = 0; i < pos - 1; i++) {
			if(tmp.hasNext())	{
				tmp = tmp.next();
			} else	{
				throw new IllegalArgumentException();
			}
		}
		Node newNode = new Node(value);
		newNode.setNext(tmp.next());
		tmp.setNext(newNode);
	}
	
	public void delete(int pos) {
		//TODO: delete Node
		Node tmp = head;
		if(pos == 0)	{
			head = tmp.next();
			return;
		}
		for (int i = 0; i < pos - 1; i++) {
			if(!tmp.hasNext())	{
				return;
			}
			tmp = tmp.next();
		}
		Node newNextNode = tmp.next().next();
		tmp.setNext(newNextNode);
	}
	
	@Override
	public String toString() {
		String ret = "";
		
		Node it = head;
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
		ll.add(8);
		ll.delete(2);
		System.out.println(ll);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(4);
//		ArrayList<Integer> pointer = al;
//		for (int i = 0; i < pointer.size(); i++) {
//			System.out.println(pointer.get(i));
//		}
	}
}
