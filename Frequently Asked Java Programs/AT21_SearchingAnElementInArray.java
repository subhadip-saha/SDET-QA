// Java Program 21: Searching an Element in Array | Binary Search

import java.util.Arrays;

public class AT21_SearchingAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For binary search- pre-requisite is array elements must be in sorted order.
		//based on the mid value, divide the array into two parts.
		
		int arr[] = {4,2,1,5,3,9,6,8,10,7};
		Arrays.sort(arr);	//array should be in sorted order
		
		// Approach 1: Logic based
		
		int key = 5;		//searchable element
		
		boolean isElementFound = false; //flag to check the status for element found or not
		int low = 0, high = arr.length - 1;		//lower and higher index set
		
		//when low > high, then there is no element
		while(low <= high)		
		{
			int mid = (low + high) / 2;
			
			if(key == arr[mid])				//mid is mid index and arr[mid] is mid value of array
			{
				System.out.println("Element found at index: " + (arr[mid] - 1));
				isElementFound = true;
				break;
			}
			
			if(key < arr[mid])
			{
				high = mid - 1;
			}
			
			if(key > arr[mid])
			{
				low = mid + 1;
			}
		}
		
		if(isElementFound == false)
			System.out.println("Element not found"); 
		
		
		//Approach 2: in built method -  Arrays.binarySearch(arr, key)
		
		//here if element is found then it will return the index position and if element is not found then return some negative value
		//System.out.println(Arrays.binarySearch(arr, 5));
	}

}
