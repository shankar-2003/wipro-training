package wiprotraining;

	import java.util.Scanner;

	public class AnagramChecker {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read two strings from user input
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();
	        
	        // Call the method to check if they are anagrams
	        if (areAnagrams(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are NOT anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        // If lengths are different, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        
	        // Convert strings to lowercase to make the comparison case-insensitive
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();
	        
	        // Initialize an array to count the occurrences of characters
	        int[] charCount = new int[26]; // Assuming only lowercase English letters
	        
	        // Count the characters in the first string
	        for (int i = 0; i < str1.length(); i++) {
	            charCount[str1.charAt(i) - 'a']++; // Increment count for the character in str1
	        }
	        
	        // Decrease the count based on the characters in the second string
	        for (int i = 0; i < str2.length(); i++) {
	            charCount[str2.charAt(i) - 'a']--; // Decrease count for the character in str2
	        }
	        
	        // Check if all counts are zero (indicating equal frequencies of characters)
	        for (int count : charCount) {
	            if (count != 0) {
	                return false; // If any count is not zero, they are not anagrams
	            }
	        }
	        
	        return true; // All counts are zero, so the strings are anagrams
	    }
	}


