package Recursion;

public class LinearSearch 
{
	public static boolean Search(int[] arr, int n, int key)
	{
		if(n <= 0)
			return false;
		if(arr[n-1] == key)
			return true;
		return Search(arr, n-1, key);
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,4,5,2,24,4};
		int key = 3;
		System.out.println(Search(arr, arr.length, key));
	}

}
