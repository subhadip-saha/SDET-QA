//Java Program 18: How To Find Maximum & Minimum Values in Array

public class AT18_MaxAndMinValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {102,20,48,15,66};
		
		int max = arr[0];
		
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("Maximum Value in Array: " + max);
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("Minimum Value in Array: " + min);
	}

}
