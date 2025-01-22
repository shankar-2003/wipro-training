package com.wiprotraining;


	import java.util.Stack;

	public class BracketValidator {
	    public static void main(String[] args) {
	        String input = "{[()]}"; // Example input

	        if (isValid(input)) {
	            System.out.println("The string is valid.");
	        } else {
	            System.out.println("The string is invalid.");
	        }
	    }

	    public static boolean isValid(String s) {
	        // Create a stack to keep track of the opening brackets
	        Stack<Character> stack = new Stack<>();

	        // Iterate over each character of the string
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            // If it's an opening bracket, push it onto the stack
	            if (ch == '{' || ch == '[' || ch == '(') {
	                stack.push(ch);
	            }
	            // If it's a closing bracket, check if it matches the top of the stack
	            else if (ch == '}' || ch == ']' || ch == ')') {
	                // If stack is empty or top of stack doesn't match the closing bracket
	                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
	                    return false;
	                }
	            }
	        }

	        // If the stack is empty, all opening brackets have been matched
	        return stack.isEmpty();
	    }

	    // Helper method to check if the opening and closing brackets match
	    private static boolean isMatchingPair(char open, char close) {
	        return (open == '{' && close == '}') || 
	               (open == '[' && close == ']') ||
	               (open == '(' && close == ')');
	    }
	}
