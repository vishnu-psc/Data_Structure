package LinkedList;

public class LL_Insertion 
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
	
	public LL_Insertion()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	//Legth of LL
	public int length()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	//Insertion from start
	public void addFirst(int e)
	{
		Node newest = new Node(e, null);
		if(head == null)
		{
			head = newest;
			tail = newest;
			size++;
			return;
		}
		else
		newest.next = head;
		head = newest;
		size++;
	}
	
	//Insertion at any position
	public void addAtPosition(int e, int position)
	{
		if(position == 1)
		{
			addFirst(e);
			return;
		}
//		if(position == length()+1)
//		{
//			addLast(e);
//			return;
//		}
		
		Node temp = head;
		int count = 1;
		while(count < position - 1)
		{
			temp = temp.next;
			count++;
		}
		Node newest = new Node(e, null);
		
		//Or we can also can do for  last element
		if(temp.next == null)
		{
			addLast(e);
			return;
		}
		newest.next = temp.next;
		temp.next = newest;
		size++;
		
	}
	
	//Insertion from last
	public void addLast(int e)
	{
		Node newest = new Node(e, null);
		if(isEmpty())
			head = newest;
		else
			tail.next = newest;
		tail = newest;
		size++;
	}
	
	//Inserting element in sorted order
	//After this function tail cant be on the last node. So, we can't perform addLast() method.
	// Cause it does not able update tail.
	public void addSorted(int e)
	{
		Node newest = new Node(e, null);
		if(isEmpty())
		{
			head = newest;
		}
		else
		{
			Node p = head;
			Node q = null;
			while(p != null && p.element < e)
			{												
				q = p;
				p = p.next;
			}
		
			if(p == head)
			{
				newest.next = head;
				head = newest;
			}
			else
			{
				newest.next = q.next;
				q.next = newest;
			}
		}
		size++;
	}
	
	//Displaying
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
	
	
	public static void main(String[] args) 
	{
		LL_Insertion l = new LL_Insertion();
		
		l.addLast(45678);
		l.addLast(123);
		
		l.display();
		
		l.addFirst(8303);
		l.display();
		
		l.addAtPosition(6, 4);
		
		l.display();
		
//		l.addSorted(1);
//		l.addSorted(0);
//		l.addSorted(7);
//		l.addSorted(6);
		
		// l.addAtPosition(5, 5);
		
//		l.display();
//		System.out.println(l.size);
//		
//		
//		System.out.println(l.head.element);
		//System.out.println(l.tail.element);
	}

}
