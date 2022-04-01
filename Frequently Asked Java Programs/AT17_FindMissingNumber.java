//Java Program 17: Find Missing Number in an Array

public class AT17_FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Condition:
		 * The Array should not have any duplicates.
		 * The array does not need to be in sorted order.
		 * Values should be in a range.
		 */
		
		int arr[] = {1,2,4,5,6};
		

		//calculating sum of all the elements present in the array
		int sum1 = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum1 = sum1 + arr[i];
		}
		
		//calculating sum of all the elements(missing included) in the array means sum of all the 
		//elements from 1 to 6
		int sum2 = 0;
		
		for(int i = 1; i <= 6; i++)
		{
			sum2 = sum2 + i;
		}
		
		System.out.println("Missing Number in an Array is: " + (sum2 - sum1));
	}

}
