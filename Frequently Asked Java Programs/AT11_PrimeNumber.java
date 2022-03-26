// Program 11: Check Given Number is Prime Or Not

//prime numbers are positive integers greater than 1 with exactly two factors, 1 and the number itself
//2 is the smallest prime number and is the only even prime number.

public class AT11_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;			//Given Number
		int count = 0;			//to count the no. of factors of the given number
		
		if(num > 1)
		{
			for(int i = 1; i <= num; i++)
			{
				if(num % i == 0)
					count++;
			}
			
			if(count == 2)
				System.out.println("Prime number");
			else
				System.out.println("Not a prime number.It is a Composite number");
		}
		else
		{
			System.out.println("Neither an prime nor a composite number");
		}
	}

}
