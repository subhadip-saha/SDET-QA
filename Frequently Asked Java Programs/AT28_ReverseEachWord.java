//Java Program 28: How To Reverse Each Word in a String

public class AT28_ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1: using manual code to reverse each word
		
		String str = "Welcome to Java";		//original string		
		String words[] = str.split(" ");	//splitting string into words with the help of " "
		
		String reverseString = "";			//for storing final whole reverse string
		
		for(String value : words)			//taking each value from the words array one by one
		{
			String reverseWord = "";		//for storing reverse word
			int len = value.length();
			for(int i = len - 1; i >= 0; i--)	//extracting one character of one word in a reverse way
			{
				reverseWord = reverseWord + value.charAt(i);	//add that character in reverse word
			}
			
			reverseString = reverseString + reverseWord + " ";	//finally adding the reverse words into a string with gap
		}
		
		System.out.println(reverseString);
		
		
		//Approach 2: using inbuilt reverse method of StringBuilder class to reverse each word
		
		String str2 = "Java - Write Once Run Anywhere";
		String words2[] = str2.split("\\s");	//splitting string into words with the help of regex expression
		
		String reverseString2 = "";
		
		for(String value2 : words2)
		{
			
			StringBuilder sbl = new StringBuilder(value2);		//at first we have to convert the word/string into StringBuilder object 
			StringBuilder reverseWord2 = sbl.reverse();
			
			reverseString2 = reverseString2 + reverseWord2 + " ";
			
			//or, you can do
			/*StringBuilder sbl = new StringBuilder(value2);
			sbl.reverse();
			reverseString2 = reverseString2 + sbl.toString() + " ";*/	//convert the StringBuilder object into a normal string and then add
		}
		
		System.out.println(reverseString2);
		
	}

}
