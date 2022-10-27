package LinkedList;

public class CountNode 
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
	
	public CountNode()
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
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.element + "------>");
			temp = temp.next;
		}
		System.out.println("NUll");
	}
	
	public int getCount(Node temp)
	{
		if(temp == null)
			return 0;
		
		return 1 + getCount(temp.next);
	}
	public static void main(String[] args) 
	{
		CountNode l = new CountNode();
		l.addLast(1);
		l.addLast(3);
		l.addLast(5);
		l.addLast(7);
		l.addLast(9);
		
		l.display();
		
		System.out.println(l.getCount(l.head));
		
		

	}

}
