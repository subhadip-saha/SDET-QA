
//Java Program 23: Sort Elements in Array Using Built-in Methods

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AT23_SortingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[] = {30,12,48,5,64,101};
		
		
		//Approach 1: using parallelSort method.
		//sort() and parallelSort() will sort the array in ascending order.
		
		/*System.out.println("Array element before sorting: " + Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Array element after sorting: " + Arrays.toString(arr));*/
		
		//Approach 2: using sort method.
		
		/*System.out.println("Array element before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array element after sorting: " + Arrays.toString(arr));*/
		
		
		
		//Reverse the elements in descending order. For this we have to use Collections.reverseOrder() method
		
		/*System.out.println("Array element before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder()); //but,  Collections.reverseOrder() method does not support primitive types i.e. int
		System.out.println("Array element after sorting: " + Arrays.toString(arr));*/
		
		//So, use derived datatype Integer for array declaration
		
		Integer arr[] = {30,12,48,5,64,101};
		
		System.out.println("Array element before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder()); 
		System.out.println("Array element after sorting: " + Arrays.toString(arr));
	}

}
