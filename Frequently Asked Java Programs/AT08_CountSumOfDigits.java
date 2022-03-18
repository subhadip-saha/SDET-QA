//Program 08: Count Sum Of Digits in a Number

public class AT08_CountSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;		
		int sum = 0;
		
		while(num > 0)
		{
			//capturing last digit of the number
			int rem = num % 10;
			//adding the last digit to the existing sum
			sum = sum + rem;
			//update the rest of the number after extracting last digit
			num = num / 10;
			
			//shortcut
			//sum = sum + num % 10;
			//num = num / 10;
		}
		
		System.out.println("The sum of digits: " + sum);
	}

}
