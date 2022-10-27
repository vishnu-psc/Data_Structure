package LinkedList;

public class LL_Search 
{
	class Node
	{
		int element;
		Node next;
		
		public Node(int e, Node n)
		{
			element = e;
			next = n;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL_Search()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public int length()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public void addLast(int e)
	{
		Node newest = new Node(e, null);
		if(isEmpty())
		{
			head = newest;
			tail = newest;
		}
		else
			tail.next = newest;
		tail = newest;
		size++;
	}
	
	public int search(int key)
	{
		Node temp = head;
		int index = 0;
		while(temp != null)
		{
			if(temp.element == key)
				return index;
			temp = temp.next;
			index++;
		}
		return Integer.MIN_VALUE;
		
	}

	public static void main(String[] args) 
	{
		LL_Search l = new LL_Search();
		
		int key = 9;
		
		l.addLast(0);
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addLast(6);
		l.addLast(7);
		l.addLast(8);
		l.addLast(9);
		
		System.out.println(l.search(key));
		
	}

}
