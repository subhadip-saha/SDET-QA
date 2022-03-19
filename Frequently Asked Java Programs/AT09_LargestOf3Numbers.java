//Program 09: Find Largest Of 3 Numbers | 2 Different Ways

import java.util.Scanner;

public class AT09_LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		
		sc.close();
		
		//Logic 1: using if-else if-else
		/*if(a > b && a > c)
			System.out.println(a + " is largest number");
		else if(b > a && b > c)
			System.out.println(b + " is largest number");
		else
			System.out.println(c + " is largest number");*/
		
		
		//Logic 2: using Ternary operator
		/*int largest1 = (a > b) ? a : b;			// getting largest between a and b	
		int largest2 = (c > largest1) ? c : largest1;	// getting largest between largest1 and c
		System.out.println(largest2 + " is largest number");*/
		
		
		//shortcut
		int largest = (c > ((a > b) ? a : b)) ? c : ((a > b) ? a : b);
		System.out.println(largest + " is largest number");
	}

}
