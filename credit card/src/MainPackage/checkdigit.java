package MainPackage;


import java.util.Scanner;



public class checkdigit {

	
	public static void main(String[] args) {

		
		Scanner input_user = new Scanner(System.in);

		
		
		String integer;

		
		System.out.println("please put you credit card number: ");

		
		
		integer = input_user.nextLine();

		
		
		
		long sum1=0;

		
		
		int sum2=0;

		
		
		String valid = " valid";

		
		
		String notValid = " not valid";

		
		
		
		
		for (int i = integer.length() -2 ; i >= 0; i-=2 ) {

			
			int multiply = 2 * Character.getNumericValue(integer.charAt(i));

			
			String toString= Integer.toString(multiply);

			
			
			for (int j = 0; j < toString.length(); j++ ) {

				
				
				int get_number = Character.getNumericValue(toString.charAt(j));

				
				
				sum1 += get_number;

			}

		}

		
		
		
		for (int j = integer.length() -1 ; j>=0; j-=2) {

			
			sum2 = sum2 + Character.getNumericValue(integer.charAt(j));

		}

		
		int wholesum = (int) (sum1+sum2);

		
		if (wholesum%10 == 0 ) {

			
			System.out.println("Credit Card #" + integer + valid);

		
		}

		
		else {

			System.out.println("Credit Card #" + integer + notValid);

		}

		System.out.println(wholesum);

	}

}