package LinkedList;

public class LL_Deletion 
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
	
	public LL_Deletion()
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
		{
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
			Node currentNode = head;
			Node previousNode = null;
			int count = 1;
			while(count < position)
			{
				previousNode = currentNode;
				currentNode = currentNode.next;
				count++;
			}
			previousNode.next = currentNode.next;
			size--;
			//temp.next = temp.next.next;
		}
		
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null) 
		{
			System.out.print(temp.element + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) 
	{
		LL_Deletion l = new LL_Deletion();
		l.addLast(0);
		
		
		l.display();
		l.removeFirst();
		l.display();
		System.out.println(l.tail.element);
	}

}
