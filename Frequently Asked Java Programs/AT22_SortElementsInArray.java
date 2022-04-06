import java.util.Arrays;

//Java Program 22: Sort Elements in Array | Bubble Sort

public class AT22_SortElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,2,1,5,3};
		
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		
		int len = arr.length;
		//outer for loop for no. of passses/iterations, if no. of elements in the array is 5 then we need 4 passes
		//NOTE: condition <= len - 1 because we need 4 pass for sorting 5 elements
		for(int i = 0; i <= len - 1; i++)
		{
			//this internal for loop is for comparing each element with adjacent element and swap if first element > second element
			//NOTE: condition < len - 1 because we are accessing one element and its next element in every pass, so in last pass next element would not be available 
			for(int j = 0; j < len - 1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;					
				}
			}
		}
		
		System.out.println("Array after sorting: " + Arrays.toString(arr));
		
		
		//using in built sort() method
		System.out.println("--------------------------------------------");
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.printf("Array after sorting: %s",Arrays.toString(arr));
	}

}
