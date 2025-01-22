package com.wiprotraining;

public class CharacterFrequency {

	    public static void main(String[] args) {
	        String input = "Hello, World!"; // Input string
	        input = input.toLowerCase();   // Convert to lowercase to ignore case sensitivity

	        int[] frequencies = new int[26]; // Array to store frequency of each letter

	        // Traverse each character in the string
	        for (char c : input.toCharArray()) {
	            // Check if the character is a letter
	            if (c >= 'a' && c <= 'z') {
	                frequencies[c - 'a']++; // Increment the count for this letter
	            }
	        }

	        // Print the frequencies
	        System.out.println("Character Frequencies:");
	        for (int i = 0; i < frequencies.length; i++) {
	            if (frequencies[i] > 0) { // Print only characters with non-zero frequency
	                System.out.println((char) (i + 'a') + ": " + frequencies[i]);
	            }
	        }
	    }
	}

