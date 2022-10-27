package Queue;

public class QueueLinkedList 
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
	
	private Node front;
	private Node rear;
	private int size;
	
	public QueueLinkedList()
	{
		front = null;
		rear = null;
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
	
	public boolean isFull()
	
	{
		return size == length();
	}
	
	public void add(int e) 
	{
		Node newest = new Node(e, null);
		if(isEmpty())
		{
			front = newest;
		}
		else
		{
			rear.next = newest;
			
		}
		rear = newest;
		size++;
	}
	
	public int remove()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		int e = front.element;
		front = front.next;
		size--;
		if(isEmpty())
		{
			rear = null;
		}
		return e;
	}
	
	public int peek()
	{
		return front.element;
	}
	
	public void display()
	{
		Node temp = front;
		while(temp != null)
		{
			System.out.print(temp.element + ".......");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		QueueLinkedList q = new QueueLinkedList();
		
		q.add(4);
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(9);
		
		q.display();
		
		q.remove();
		q.remove();
		q.remove();
		
		q.display();
		
		q.add(0);
		
		q.display();
		
		System.out.println(q.peek());
	}

}
