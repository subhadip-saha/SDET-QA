//Check Given String is Palindrome or Not

import java.util.Scanner;

public class AT05_CheckPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter a string: ");
		String org_str = sc.next();		
		sc.close();
		
		//handling edge case - MADAM, madam, Madam
		String lo_str = org_str.toLowerCase();
		
		//program to reverse a string
		String rev = "";
		int len = lo_str.length();
		
		for(int i = len - 1; i >= 0; i--)
		{
			rev = rev + lo_str.charAt(i);
		}
		
		//if original string equals to reverse string then palindrome
		if(lo_str.equals(rev))
			System.out.println(org_str + " is Palindrome String");
		else
			System.out.println(org_str + " is Not Palindrome String");
	}

}
