package com.wiprotraining;


	import java.util.Scanner;

	public class MaxSubarraySum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get array size and elements
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Call the function to find the maximum sum of subarray
	        int maxSum = findMaxSumSubarray(array);
	        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);
	    }

	    // Function to find the maximum sum of a contiguous subarray
	    private static int findMaxSumSubarray(int[] array) {
	        int currentSum = 0;
	        int maxSum = Integer.MIN_VALUE;  // Initialize to the smallest possible value

	        // Traverse the array to find the maximum sum subarray
	        for (int num : array) {
	            currentSum = (currentSum + num > num) ? currentSum + num : num; // Conditional operator to update current sum
	            maxSum = (currentSum > maxSum) ? currentSum : maxSum; // Conditional operator to update max sum
	        }

	        return maxSum;
	    }
	}


