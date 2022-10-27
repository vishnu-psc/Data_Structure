package Circular_LinkedList;

public class CLL_Deletion 
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
	
	public CLL_Deletion()
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
			newest.next = newest;
			head = newest;
		}
		else
		{
			newest.next = tail.next;
			tail.next = newest;
		}
		tail = newest;
		size++;
	}
	
	public void removeFirst()
	{
		if(isEmpty())
		{
			System.out.println("LIST IS EMPTY");
		}
		tail.next = head.next;
		head = head.next;
		size--;
		if(isEmpty())
		{
			head = null;
			tail = null;
		}
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
		temp.next = tail.next;
		tail = temp;
		size--;
	}
	
	public void removeAny(int position)
	{
		if(position <= 0 || position > length()+1)
		{
			System.out.println("INVALID POSITION");
		}
		else if(isEmpty())
		{
			System.out.println("List is Empty");
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
			size--;
		}
	}
	
	public void display()
	{
		 Node temp = head;
		 int count = 0;
		 while(count < length())
		 {
			 System.out.print(temp.element + "-->");
			 temp = temp.next;
			 count++;
		 }
		 System.out.println();
	}
	
	public static void main(String[] args) 
	{
		CLL_Deletion l = new CLL_Deletion();
		
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addLast(6);
		l.display();
		l.removeLast();
		l.display();
		System.out.println(l.length());

	}

}
