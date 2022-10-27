package Recursion;

public class IsSorted 
{
	public static boolean isSorted(int[] arr, int size)
	{
		if(size == 0|| size == 1)
			return true;
		if(arr[size - 2] > arr[size - 1])
			return false;
		
		return isSorted(arr, size-1);
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,5,5};
		System.out.println(isSorted(arr, arr.length));

	}

}
