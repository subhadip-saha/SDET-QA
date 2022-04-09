// Java Program 29: How To Read Data From Text File

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AT29_ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Approach 1: Using FileReader and BufferedReader
		
	/*	FileReader fr = new FileReader("E:\\abc.txt");	//fr is representing this file
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
	//	str = br.readLine();
		
	//	while(str != null)
	//		System.out.println(str);			//infinite loops
	
		
		
		//reading each and every line using readLine method one by one and store them in str.
		//it will print upto until str becomes null.
		
		while((str = br.readLine()) != null)	
		{
			System.out.println(str);
		}
		
		br.close();
		
	*/
		
		//Approach 2: Using File and Scanner
		
		/*File file = new File("E:\\abc.txt");
		
		//Whatever file variable is represnting that abc.txt file, that file we have to pass as parameter inside scanner
		
		Scanner sc = new Scanner(file);
		
		//we have to read each and every line from file
		
		while(sc.hasNextLine())		//if sc contains next line, then hasNextLine is true
		{
			//nextLine() - it will read the content from file
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 3: Without use of any loop
		
		File file = new File("E:\\abc.txt");
		
		Scanner sc = new Scanner(file);
		
		//here we have to specify a regular expression, it is matching each and every line in the file
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
