package Stack;

public class StackLL 
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
	
	private Node top;
	private int size;
	
	public StackLL()
	{
		top = null;
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

	public void push(int e)
	{
		Node newest = new Node(e, null);
		if(isEmpty())
			top = newest;
		else
		{
			newest.next = top;
			top = newest;
		}
		size++;
	}

	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY");
			return -1;
		}
		int e = top.element;
		top = top.next;
		size--;
		return e;
	}

	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY ");
			return -1;
		}
		int e = top.element;
		return e;
	}

	
	public static void main(String[] args) 
	{
		StackLL s = new StackLL();
		s.push(1);
		s.push(2);
		s.push(3);
		s.display();
		System.out.println("Size: " + s.length());
		s.pop();
		s.pop();
		System.out.println(s.peek());

		s.display();
		System.out.println(s.top.element);

	}
	public void display()
	{
		Node temp = top;
		while(temp != null)
		{
			System.out.print(temp.element + "-->");
			temp = temp.next;
		}
		System.out.println("BOTTOM");
	}

}
