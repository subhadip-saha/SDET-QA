//Program 07: Count Number Of EVEN & ODD Digits in A Number

public class AT07_CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 761248;
		int evenCount = 0, oddCount = 0;
		
		while(num > 0) 
		{
			//extracting last digit of the number
			int rem = num % 10;
			
			//checking if last digit is even or odd and increase count accordingly
			if(rem % 2 == 0)
				evenCount++;
			else
				oddCount++;
			
			//update the rest of the number after extracting last digit
			num = num / 10;
		}
		
		System.out.println("No. of Even digits: " + evenCount);
		System.out.println("NO. of Odd digits: " + oddCount);
		
	}

}
