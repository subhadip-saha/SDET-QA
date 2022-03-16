//Program 06: Count Number Of Digits in A Number

public class AT06_CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123456;
		
		int count = 0; //stores the no. of digits
		
		while(num > 0)
		{
			num = num / 10;
			count++;
		}
		
		System.out.println("The no. of digits: " + count);
	}

}
