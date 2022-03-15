import java.util.Scanner;

//Check Given Number is Palindrome or Not

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		int org_num = num;
		//reverse the number
		int rev = 0;
		
		while(num != 0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;		
		}
		
		if(org_num == rev)
			System.out.println(org_num + " is a palindrome number");
		else
			System.out.println(org_num + " is not a palindrome number");
	}

}
