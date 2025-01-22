package wiprotraining;

	import java.util.Scanner;

	public class PalindromeChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Call the method to check if it's a palindrome
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        // Remove spaces and convert to lowercase
	        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();
	        
	        // Reverse the string
	        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
	        
	        // Check if the cleaned string is equal to its reverse
	        return cleanedStr.equals(reversedStr);
	    }
	}

