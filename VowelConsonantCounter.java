package wiprotraining;

	import java.util.Scanner;

	public class VowelConsonantCounter {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Call the method to count vowels and consonants
	        countVowelsAndConsonants(input);
	    }

	    public static void countVowelsAndConsonants(String str) {
	        int vowelCount = 0, consonantCount = 0;
	        
	        // Convert the string to lowercase for case-insensitivity
	        str = str.toLowerCase();
	        
	        // Loop through each character in the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            // Check if the character is an alphabet letter
	            if (Character.isAlphabetic(ch)) {
	                // Use a switch statement to check vowels
	                switch (ch) {
	                    case 'a':
	                    case 'e':
	                    case 'i':
	                    case 'o':
	                    case 'u':
	                        vowelCount++;
	                        break;
	                    default:
	                        consonantCount++;
	                        break;
	                }
	            }
	        }
	        
	        // Output the results
	        System.out.println("Vowels count: " + vowelCount);
	        System.out.println("Consonants count: " + consonantCount);
	    }
	}
