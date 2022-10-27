package Recursion;

public class SumOfArray 
{
	public static int getSum(int[] arr, int n)
	{
		if(n <= 0)
			return 0;
		
		return getSum(arr, n-1) + arr[n-1];
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,2};
		System.out.println(getSum(arr, arr.length));
	}

}
