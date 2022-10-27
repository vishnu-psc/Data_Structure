package Stack;

public class StackArray 
{
	private int[] data;
	private int top;
	
	public StackArray(int n) 
	{
		data = new int[n];
		top = 0;
	}
	
	public int length()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top == 0;
	}
	
	public boolean isFull()
	{
		return top == data.length;
	}
	
	public void push(int e)
	{
		if(isFull())
		{
			System.out.println("STACK IS FULL/OVERFLOW");
			return;
		}
		else
		{
			data[top] = e;
			top = top + 1;
		}
	}	

	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY/UNDERFLOW");
			return -1;
		}
		int e = data[top - 1];
		top = top - 1;
		return e;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY");
			return -1;
		}
		return data[top - 1];
	}
	
	public void display()
	{
		for(int i = 0; i < top; i++)
			System.out.print(data[i] + "-->");
		System.out.println("BOTTOM");
	}
	
	public static void main(String[] args) 
	{	
		StackArray s = new StackArray(10);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		System.out.println("SIZE: " + s.length());
		System.out.println(s.peek());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		s.display();
		
		
	}

}
