//Program 25: How To Remove White Spaces in a String

public class AT25_RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =  "Hi Subhadip,         Good Morning, Welcome to       JAVA. ";
		System.out.println("Before removing spaces: " + s);
		
		s = s.replaceAll("\\s", "");		
		System.out.println("After removing spaces: " + s);
	}

}
