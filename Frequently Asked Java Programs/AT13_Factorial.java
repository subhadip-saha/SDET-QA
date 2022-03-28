//Program 13: Factorial of a Number

public class AT13_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		long factorial = 1;
		
		//5! = 1*2*3*4*5 = 120
		/*for(int i = 1; i <= num; i++)		//loop in ascending order
		{
			//factorial = factorial * i;
		}*/

		//5! = 5*4*3*2*1 = 120
		for(int i = num; i >= 1; i--)		//loop in descending order
		{
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of number is: " + factorial);
	}

}
