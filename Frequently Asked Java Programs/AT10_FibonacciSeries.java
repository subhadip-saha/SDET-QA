//Program 10: Generate Fibonacci series

public class AT10_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 1;
		System.out.print(n1 + " " + n2);
		
		//i starts from 2 because already two numbers i.e. 0 and 1 are printed and we want in the series 10 numbers to be printed
		for(int i = 2; i < 10; i++) 
		{
			int sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

}
