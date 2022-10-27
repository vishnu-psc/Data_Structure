package Circular_LinkedList;

public class CLL_Insertion 
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
	
	public CLL_Insertion()
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
			newest.next = head;
			tail.next = newest;
		}
		tail = newest;
		size++;
	}
	
	public void addFirst(int e)
	{
		Node newest = new Node(e, null);
		if(isEmpty())
		{
			newest.next = newest;	
			tail = newest;
		}
		else
		{
			tail.next = newest;
			newest.next = head;
		}
		head = newest;
		size++;
	}
	
	public void addAny(int e, int position)
	{
		if(position <= 0 || position > length()+1)
		{
			System.out.println("INVALID POSITION");
			return;
		}
		else if(position == 1) 
		{
			addFirst(e);
			return;
		}
		else if(position == length() + 1)
		{
			addLast(e);
			return;
		}
		else 
		{
			Node newest = new Node(e, null);
			Node temp = head;
			int count = 1;
			while(count < position - 1)
			{
				temp = temp.next;
				count++;
			}
			newest.next = temp.next;
			temp.next = newest;
			size++;
			
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
		CLL_Insertion l = new CLL_Insertion();
		l.addLast(0);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addFirst(5);
		l.display();
//		System.out.println(l.size);
//		
//		l.addAny(6, 0);
//		l.display();
//		System.out.println(l.size);
		
		
		

	}

}
