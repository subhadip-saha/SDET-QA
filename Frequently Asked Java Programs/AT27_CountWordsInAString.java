
// Java Program 27: How To Count Words in a String

import java.util.Scanner;

public class AT27_CountWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//condition for word: after one character of a word, there should be a space and after the space there should be any character
		//for next word means after the space there should not be any empty space.
		
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 1;
		for(int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
				count++;
		}
		
		System.out.println("The Words in the String are: " + count);
	}

}
