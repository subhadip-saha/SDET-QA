//Program 24: How To Remove Junk or Special Characters in String

public class AT24_RemoveJunkFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =  "<([{\\^-=$!|]})?*+.> Hi Subhadip, Good Morning, Welcome to JAVA. 012345678 9";
		System.out.println("Before removing junks: " + s);
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");		
		System.out.println("After removing junks: " + s);

		
	}

}
