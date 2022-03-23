//Program 26: How To Count Occurrences of a Character in a String

public class AT26_CountCharacterOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is anywhere";
		int totalCount = str.length();		//total no. of characters i.e. length of string
		
		String str1 = str.replace("a", "");
		int countAfterRemove = str1.length();
		
		int count = totalCount - countAfterRemove;
		System.out.println("No. of times 'a' appears: " + count);
		
	}

}
