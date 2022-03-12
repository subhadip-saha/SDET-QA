// Program 01: Swap Two Numbers | 5 Ways of swapping Numbers

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20;
		
		System.out.println("Before swapping: " + a + " " + b);
		
		
		//Logic 1: with using a third variable
		
		/*int temp; 
		
		temp = a;
		a = b;
		b = temp;*/
			
		//Logic 2: using + and - (without using a third variable)
		
		/*a = a + b;
		b = a - b;
		a = a - b;*/
		
		//Logic 3: using * and /  (without using a third variable)
		
		/*a = a * b;
		b = a / b;
		a = a /b;*/
		
		//Logic 4: using Bitwise XOR  (without using a third variable)
		
		/*a = a ^ b;		//0 XOR 0 = 0
		b = a ^ b;
		a = a ^ b;*/
		
		//Logic 5: Single Statement
		
		b = a + b - (a = b);
		
		
		System.out.println("After swapping: " + a + " " + b);
	}

}
