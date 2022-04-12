//Program 02: Reverse A Number | 3 Ways of Reverse a Number

import java.util.Scanner;

public class AT02_ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");		
		int num = sc.nextInt();
		sc.close();
		//Logic 1: using algorithm
		
		/*int rev = 0; 
		while(num != 0)
		{
			//rev = rev * 10 + num % 10;
			//num = num / 10;
			//------------ or ------------
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}*/
		
		//Logic 2: using StrinBuffer class
		
		/*StringBuffer rev;
		//whatever number we are accepting from the user, convert that into String format
		StringBuffer sbf = new StringBuffer(String.valueOf(num));
		rev = sbf.reverse();*/
		
		//Logic 3: using StringBuilder class
		
		StringBuilder rev; 
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		rev = sbl.reverse();
		
		System.out.println("Reverese is: " +rev);
		
	}

}
