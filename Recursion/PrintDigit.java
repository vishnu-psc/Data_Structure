package Recursion;

public class PrintDigit 
{
	public static void print(int n, String[] arr)
	{
		if(n == 0)
			return;
		
		int digit = n % 10;
		n = n/10;
		
		print(n, arr);
		
		System.out.print(arr[digit] + " ");
	}
	public static void main(String[] args) 
	{
		int n = 564738;
		String[] arr =  {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		print(n, arr);
		

	}

}
