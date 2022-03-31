//Java Program 16: How To Check The Equality Of Two Arrays

import java.util.Arrays;

public class AT16_CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,4,5,6};
		
		//Approach 1: Using Arrays.equal()
		
		/*boolean isEqual = Arrays.equals(arr1, arr2);		//checking status
		
		if(isEqual == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");*/
		
		//Approach 2: Without using Arrays.equal()
		
		//status true means we have assumed initially, that the total no. of elements in both the arrays are same and 
		//elements are also equal.
		
		boolean status = true;
		
		if(arr1.length == arr2.length)
		{
			for(int i = 0; i < arr1.length; i++)
			{
				if(arr1[i] != arr2[i])		//we are just checking when corresponding elements are not equal then making status false
				{
					status = false;
				}
			}
		}
		
		if(status == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

		
			//if no. of elements in the arrays are same, means length of them are same then compare each of these elements
		//once elements of corresponding positions of those two arrays becomes unequal then status will be false  
		
			

	}

}
