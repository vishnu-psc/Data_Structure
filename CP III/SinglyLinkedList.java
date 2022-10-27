// Implementation of ListNode in a SLL

public class SinglyLinkedList
{	
	private ListNode head;

	public static class ListNode
	{
		private int data;
		private ListNode next;

		public ListNode(int data)
        	{
            		this.data = data;
            		this.next = null;
        	}
	}

    	public void display(ListNode head)
    	{
        	ListNode temp = head;
        	while(temp != null)
        	{
            		System.out.print(temp.data + "-->");
            		temp = temp.next;
        	}
        	System.out.println("NULL");
    	}

    	public int length()
   	{
        	int count = 0;
        	ListNode temp = head;
	        while(temp != null)
        	{
	            count++;
        	    temp = temp.next;
       		}
        	return count;
    	}

    	public void insertLast(int value)
    	{
        	ListNode newest = new ListNode(value);
        	ListNode temp = head;
        	while(temp.next != null ) temp = temp.next;
	        temp.next = newest;
    	}

	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

    	public static void main(String[] args) 
    	{
        	SinglyLinkedList sll = new SinglyLinkedList();
	        sll.head = new ListNode(10);
        	ListNode second = new ListNode(53);
	        ListNode third = new ListNode(13);
        	ListNode fourth = new ListNode(67);

	        sll.head.next = second;
        	second.next = third;
	        third.next = fourth;
        	sll.insertLast(5);
		sll.insertFirst(35);
	        sll.display(sll.head);
        	System.out.println("Length is " + sll.length());
	}
}