package Recursion;

public class BinarySearch 
{
	public static boolean bSearch(int[] arr, int key, int s, int e)
	{
		if(s > e)
			return false;
		int mid = s + (e-s)/2;
		if(arr[mid] == key)
			return true;
		else if(arr[mid] > key)
			return bSearch(arr, key, s, mid-1);
		else
			return bSearch(arr, key, mid + 1, e);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(bSearch(arr, 9, 0, arr.length - 1));

	}

}
