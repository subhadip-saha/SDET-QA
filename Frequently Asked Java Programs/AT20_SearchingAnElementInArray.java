//Java Program 20: Searching an Element in Array | Linear Search

public class AT20_SearchingAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Linear Search
		
		/*int arr[] = {102,20,48,15,66};
		int searchElem = 15;
		
		boolean isFound = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == searchElem)
			{
				isFound = true;
				break;
			}
				
		}
		
		if(isFound == true)
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");*/
		
		
		//if we want to know what index position that search element is found then, 
		
		int arr[] = {102,20,48,15,66};
		int searchElem = 15;
		
		boolean isFound = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == searchElem)
			{
				System.out.println("Element is found at index:" + i);
				isFound = true;
				break;
			}
				
		}
		
		if(isFound == false)
			System.out.println("Element is not found");
	}

}
