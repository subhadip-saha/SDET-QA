//Java Program 19: How To Find Duplicate Elements in Array

import java.util.HashSet;

public class AT19_DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr[] = {"C", "C++", "Java", "Python", "Java"};
		
		boolean isDuplicateFound = false;		//checking for Duplicate Elements found in array or not
		
		//Approach 1: using for loop
		
		/*for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Found duplicate element: " + arr[i]);
					isDuplicateFound = true;
				}			
			}
		}
		
		if(isDuplicateFound == false)
			System.out.println("Duplicate element is not found");*/
		
		
		
		
		//Approach 1: using hashset - It only accepts only unique value, it does not allow duplicate value
		
		/*HashSet<String> hs = new HashSet<>();
		
		System.out.println(hs.add("Java"));		//true - it will successfully add value to hashset
		System.out.println(hs.add("C++"));		//true - it will successfully add value to hashset
		System.out.println(hs.add("Java"));		//false - as it is duplicate value
		
		using this feature we will Find Duplicate Elements in Array */
		
		//read each and every element from the array and add to the hashset, if hashset returns true, 
		//  means no duplicate and if hashset returns false,  means duplicate 
		
		HashSet<String> hs = new HashSet<>();
		
		for(String value : arr)
		{
			//hs.add(value);								//it will return true or false  based on the fact that the value is duplicate or not
			//System.out.println(hs.add(value));		//proof of above statement: it will print true or false 
			
			if(hs.add(value) == false) 
			{
				System.out.println("Found duplicate element: " + value);
				isDuplicateFound = true;
			}
				
		}
		
		if(isDuplicateFound == false)
			System.out.println("Duplicate element not found in array");
		

	}

}
