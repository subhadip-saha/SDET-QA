//Program 14: Find Sum of Elements in Array

public class AT14_SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5};
		int sum = 0;
		
		/*for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}*/

		
		/*Enhanced for loop - for-each loop. The advantage is: 
		 	no need for indexing to retrieve array elements
			no need for initialization, condition and increment/decrement like normal for loop
			It will automatically repeat multiple times depending on the number of values 		*/
		
		for(int value:arr)
		{
			sum = sum + value;
		}
			
		System.out.println("Sum of Elements in This Array: " + sum);
	}

}
