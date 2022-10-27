package Doubly_LinkedList;

public class DLL_Insertion 
{
	class Node
	{
		int element;
		Node next;
		Node prev;
		
		public Node(int e, Node n, Node p)
		{
			element = e;
			next = n;
			prev = p;
		}
			
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public DLL_Insertion()
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
		Node newest = new Node(e, null, null);
		if(isEmpty())
		{
			head = newest;
			
		}
		else
		{
			newest.prev = tail;
			tail.next = newest;
		}
		tail = newest;
		size++;

	}
	
	public void addFirst(int e)
	{
		Node newest = new Node(e, null, null);
		if(head == null)
		{
			head = newest;
			tail = newest;
		}
		else
		{
			newest.next = head;
			head.prev = newest;
			head = newest;
		}
		size++;
	}
	
	public void addAny(int e, int position)
	{
		Node newest = new Node(e, null, null);
		if(position == 1)
		{
			addFirst(e);
			return;
		}
		
		Node temp = head;
		int count = 1;
		while(count < position -1)
		{
			temp = temp.next;
			count++;
		}
		if(temp.next == null)
		{
			addLast(e);
			return;
			
		}
		else 
		{
			newest.next = temp.next;
			newest.prev = temp;
			temp.next.prev = newest;
			temp.next = newest;
		}
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
		System.out.println("NULL");
	}
	
	
	public static void main(String[] args) 
	{
		DLL_Insertion l = new DLL_Insertion();
		
//		l.addLast(2);
//		l.addLast(43);
//		l.addLast(0);
//		l.addFirst(56);
//		l.addAny(455, 3);
		
		l.display();
		System.out.println(l.size); 
		System.out.println(l.head.element + " " + l.tail.element);
		//System.out.println(l.head);
	}

}
