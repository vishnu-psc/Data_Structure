package Queue;

public class QueueArray 
{
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueArray(int n)
	{
		data = new int[n];
		front = 0;
		rear = 0;
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
		return size == data.length;
	}
	
	public void add(int e)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		else
		{
			data[rear] = e;
			rear = rear + 1;
			size++;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else	
		{
			int e = data[front];
			for(int i = 0; i < rear-1; i++) 
			{
	            data[i] = data[i + 1];
	        }
			size--;
	        rear--;
			return e;
		}
	}
	
	public void display()
	{
		for(int i = front; i < rear; i++)
		{
			System.out.print(data[i] + "--");
		}
		System.out.println();
	}
	
	public int peek()
	{
		return data[front];
	}
	
	public static void main(String[] args) 
	{
		QueueArray q = new QueueArray(5);
		q.add(67);
		q.add(8);
		q.add(5);
		q.add(9);
		q.add(1);
		
		q.display();
		
		q.pop();
		q.pop();
		q.pop();
		
		q.display();
		
		q.add(0);
		
		q.display();

	}

}
