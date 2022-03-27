//Java Program 12: How To Generate Random Numbers & Strings | Apache Commons API

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class AT12_GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach 1 : Using pre-built Random class object we can generate random numbers of type int and double
		
		Random rand = new Random();
		
		
		//int rand_int = rand.nextInt();		//generate any integer random number +ve or -ve	
		
		//we can give range also - must be positive
		//int rand_int = rand.nextInt(-10);		//Exception in thread "main" java.lang.IllegalArgumentException: bound must be positive
		//int rand_int = rand.nextInt(10);		//generate any integer random number from 0 to 9
		//int rand_int = rand.nextInt(100);		//generate any integer random number from 0 to 99
		//int rand_int = rand.nextInt(1000);	//generate any integer random number from 0 to 999
		int rand_int = rand.nextInt(5000);		//generate any integer random number from 0 to 4999		
		System.out.println(rand_int);
		
		//generate any random number of type double in b/w range 0.0 to <1.0	
		double rand_dbl = rand.nextDouble();		//don't have to provide range/bound
		System.out.println(rand_dbl);

		
		//Approach 2 : Using pre-built random() method of Math class, but this way we can generate only random decimal numbers
		System.out.println(Math.random());
		
		
		//Approach 3 : using Apache Commons API - by this we can generate random numbers as well as random strings
		//jar file download link for Apache Commons Lang 3.12.0 (Java 8+): https://commons.apache.org/proper/commons-lang/download_lang.cgi
		
		String randNum = RandomStringUtils.randomNumeric(5);	//genearting random 5 digit int numbers
		System.out.println(randNum);
		
		String randStr = RandomStringUtils.randomAlphabetic(5);	//genearting random string taking 5 alphabets from a to z
		System.out.println(randStr);
	}

}
