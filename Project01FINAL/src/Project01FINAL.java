import java.util.Scanner;

public class Project01FINAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int selection; 
		do {
			
			selection = displayMenu(sc);
			// user select one item
			switch (selection ) {
			case 1: 
				numberProcess(sc); 
				break;
			case 2: 
				charProcess(sc);
				break;
			case 3: 
				stringProcess(sc); 
				break;
			case 0: 
				break;
			default:
				System.out.println("Invalid input. Please try again.");
			}
			
		} while (selection != 0);
		
			
		
		
	}
	public static int displayMenu(Scanner sc) {
		System.out.println();
		System.out.println("Select one item from the menu below.");
		System.out.println("Select item 0 to terminate the program.");
		
		System.out.println("Main Menu: ");
		System.out.println("	1. Number");
		System.out.println("	2. Character");
		System.out.println("	3. String");
		System.out.println("	0. Exit");
		
		System.out.println("Select a number: ");
		int selectItem = sc.nextInt();
		
		if (selectItem > 3) {
			System.out.println("Invalid input. Please try again.");
		}
		return selectItem;
	}
	
	public static void numberProcess(Scanner sc) {
		int num = (int)(Math.random() * 10000 + 1);
		int choice = 0;
		do {
			
			System.out.printf("	Random number is \"%d\"\n", num);
			System.out.println("	1. Is it an even or odd number?");
			System.out.println("	2. Is it a prime number?");
			System.out.println("	3. The sum of all digits is?");
			System.out.println("	4. Are the digits sorted?");
			System.out.println("	0. Return to Main Menu");
			
			System.out.println("Select a number: ");
			choice = sc.nextInt();
//			if (choice > 4) {
//				System.out.println("Invalid input. Please try again.");
//			}
			
			switch(choice) {
			
			case 1:
				evenOdd(num);
				break;
			case 2:
				isPrime(num);
				break;
			case 3:
				digitSum(num);
				break;
			case 4:
				isSorted(num);
				break;
			case 0: 
				break;
			default:
				System.out.println("Invalid input. Please try again.");
			}
			
		} while (choice != 0);
		// Put everything into the loop, add input
	}
	public static void evenOdd(int n) {	
		if ( n % 2 == 0) {
			System.out.println("The number is an even number.");
		}
		else {
			System.out.println("The number is an odd number.");
		}
		
		//return n;
	}
	public static void isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				isPrime = false;
				System.out.println("The number is not a prime number.");
				break;
			}
			System.out.println("The number is a prime number.");
			
		}
		//return isPrime;
	}
	public static void digitSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Sum: " + sum);
		
		//return sum;
		}
	public static void isSorted (int n) {
			///1234
		int temp = n;
		int lastDigit = n % 10; // 4
		int currentDigit = (n / 10) % 10; // 3
	
		boolean isAscending = true;
		boolean isDescending = true;
			
	//Checking for Ascending: 
		while (n > 0) {
			if(!(lastDigit >= currentDigit)) {
				isAscending = false;
				break;
			}
			else {
				n /= 10; //123
				temp = currentDigit;
				lastDigit = currentDigit; // 3
				currentDigit = n % 10; 
			}
		}
			//Checking for Descending
		n = temp;
		lastDigit = n % 10;
		currentDigit = (n/10) % 10;
		
		while (n > 0)  {
			if(!(lastDigit <= currentDigit)) {
				isDescending = false;
				break;
			}
			else {
				n /= 10; //123
				temp = currentDigit;
				lastDigit = currentDigit; // 3
				currentDigit = n % 10; 
			}
		}
			
		if (isAscending || isDescending) {
			System.out.println("The digits are sorted.");
		}
		else {
			System.out.println("The digits are not sorted.");
		}
		//return (isAscending || isDescending);
	}
			
	public static void charProcess(Scanner sc)	{
		char ch = (char)(Math.random() * (126 - 33 + 1) + 33);
		int choice = 0;
		do {
			
			System.out.printf("	Random character is \"%c\"\n", ch);
			System.out.println("	1. What is the ASCII code?");
			System.out.println("	2. Is it a digital character?");
			System.out.println("	3. Is it an uppercase letter?");
			System.out.println("	4. It is a lowercase letter?");
			System.out.println("	0. Return to Main Menu");
			
			System.out.println("Select a number: ");
			choice = sc.nextInt();
//			if (choice > 4) {
//				System.out.println("Invalid input. Please try again.");
//			}
			
			switch(choice) {
			
			case 1:
				getASCII(ch);
				break;
			case 2:
				isDigital(ch);
				break;
			case 3:
				isUpper(ch);
				break;
			case 4:
				isLower(ch);
				break;
			case 0: break;
			default:
				System.out.println("Invalid input. Please try again.");
			}
			
		} while (choice != 0);
	}
	public static void getASCII (char a) {
		int ascii = (int)a;
		System.out.println("The ASCII code is " + ascii);
	}
	public static void isDigital (char a) {
		if (a >= '0' && a <= '9') {
			System.out.println("The character is digital");
		}
		else {
			System.out.println("The character is not digital");
		}
	}
	public static void isUpper (char a) {
		if (a >= 'A' && a <= 'Z') {
			System.out.println("The character is uppercase");
		}
		else {
			System.out.println("The character is not uppercase");
		}
	}
	public static void isLower (char a) {
		if (a >= 'a' && a <= 'z') {
			System.out.println("The character is lowercase");
		}
		else {
			System.out.println("The character is not lowercase");
		}
	}

	public static void stringProcess(Scanner sc) {
		System.out.println("Input a string: ");
		sc.nextLine();
		String s = sc.nextLine();
		int choice = 0;
		do {
		
			System.out.printf("	The string is \"%s\"\n", s);
			System.out.println("	1. What is the string length?");
			System.out.println("	2. How many letters are in the string?");
			System.out.println("	3. How many digits are in the string?");
			System.out.println("	4. Is the string a palindrome");
			System.out.println("	0. Return to Main Menu");
		
			System.out.println("Select a number: ");
			choice = sc.nextInt();
//			if (choice > 4) {
//				System.out.println("Invalid input. Please try again.");
//			}
			
			switch(choice) {
		
			case 1:
				getLength(s);
				break;
			case 2:
				letterCount(s);
				break;
			case 3:
				digitCount(s);
				break;
			case 4:
				isPalindrome(s);
				break;
			case 0: break;
			default:
				System.out.println("Invalid input. Please try again.");
			}
		
		} while (choice != 0);
	}
	public static void getLength (String s) {
		int length = s.length();
		System.out.println("The string length is " + length);
	}
	public static void letterCount (String s) {
		int letter = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				letter++;
			}
		}
		System.out.println("There are " + letter + " letters in the string.");
	}
	public static void digitCount (String s) {
		int digit = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				digit++;
			}
		}
		System.out.println("There are " + digit + " digits in the string.");
	}
	public static void isPalindrome (String s) {
		boolean bIsP = true;
		for (int i = 0; i < s.length()/2; i++ ) {
			if(s.charAt(i) != s.charAt(s.length()-1 - i)){
				bIsP = false;
				System.out.println("The string is not a palindrome.");
				break;
			}
		}
		System.out.println("The string is a palindrome.");
		
	
	}


}