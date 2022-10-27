package Doubly_LinkedList;

public class DLL_Deletion 
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
	
	public DLL_Deletion()
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
			tail = newest;
			
		}
		else
		{
			newest.prev = tail;
			tail.next = newest;
			tail = newest;
			
		}
		size++;

	}
	
	public void removeFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}		
		head = head.next;
		size--;
		if(isEmpty())
			tail = null;
		else
			head.prev = null;
		
	}
	
	public void removeLast()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node temp = head;
		int count = 1;
		while(count < length() - 1)
		{
			temp = temp.next;
			count++;
		}
		tail = temp;
		tail.next = null;
		size--;
		
	}
	
	public void removeAny(int position)
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}
		else if(position == 1)
		{
			removeFirst();
			return;
		}
		else if(position == length())
		{
			removeLast();
			return;
		}
		else
		{
			Node temp = head;
			int count = 1;
			while(count < position - 1)
			{
				temp = temp.next;
				count++;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
			size--;
		}
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
		DLL_Deletion l = new DLL_Deletion();
		l.addLast(2);
		l.addLast(4);
		l.addLast(0);
		l.display();
		l.removeAny(2);
		l.display();
		System.out.println(l.size);
		
	}

}
