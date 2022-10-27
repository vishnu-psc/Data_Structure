package LinkedList;

public class LL_Reverse 
{
	class Node
	{
		int element;
		Node next;
		
		Node(int e, Node n)
		{
			element = e;
			next = n;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	LL_Reverse() 
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public int length()
	{
		return size;
	}
	
	public void addLast(int e)
	{
		Node newest = new Node(e, null);
		if(isEmpty())
		{
			head = newest;
		}
		else
		{
			tail.next = newest;
		}
		tail = newest;
		size++;
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.element + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	//With Iteration
//	public void reverseLL()
//	{
//		if(isEmpty() || length() == 1)
//			return;
//		
//		Node previous = null;
//		Node current = head;
//		Node forward = null;
//		
//		while(current != null)
//		{
//			forward = current.next;
//			current.next = previous;
//			previous = current;
//			current = forward;
//		}
//		head = previous;
//	}
	
	//With Recurssion
	public Node reverseLL(Node head)
	{	
		if(head == null || head.next == null)
		{
			return head;
		}
		
		Node newHead = reverseLL(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return newHead; 
	}
	
	
	public static void main(String[] args) {
		LL_Reverse l = new LL_Reverse();
		
		l.addLast(3);
		l.addLast(6);
		l.addLast(2);
		l.addLast(9);
		l.addLast(0);
		l.addLast(4);
		
		l.display();
		
		l.head = l.reverseLL(l.head);
		
		l.display();
		
		

	}

}
