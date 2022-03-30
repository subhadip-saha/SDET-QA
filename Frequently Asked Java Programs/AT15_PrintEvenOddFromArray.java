//Program 15: Print Even & Odd Numbers from an Array

public class AT15_PrintEvenOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6};
		
		//using normal for loop
		
		/*System.out.println("Even Numbers in an Array");
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] % 2 == 0)
					System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Numbers in an Array");
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] % 2 != 0)
					System.out.println(arr[i]);
			}
		}*/
		
		//using enhanced for loop
		
		System.out.println("Even Numbers in an Array");
		for(int value : arr)
		{
			if(value % 2 == 0)
				System.out.println(value);			
		}
		
		System.out.println("Odd Numbers in an Array");
		for(int value : arr)
		{
			if(value % 2 != 0)
				System.out.println(value);			
		}
	}

}
