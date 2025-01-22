package com.wiprotraining;


	import java.util.Scanner;

	public class ArrayRotation {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get array size and elements
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        if (size <= 0) {
	            System.out.println("Array size must be greater than zero.");
	            return; // Exit if the size is invalid
	        }

	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Get rotation direction and steps
	        System.out.print("Enter the number of rotations: ");
	        int n = scanner.nextInt();

	        System.out.print("Enter the direction of rotation (left or right): ");
	        String direction = scanner.next().toLowerCase();

	        // Normalize rotations to the array size
	        n = n % size; // If n >= size, it wraps around
	        if (n < 0) n += size; // Handle negative rotations

	        // Perform the rotation
	        if (direction.equals("left")) {
	            rotateLeft(array, n);
	        } else if (direction.equals("right")) {
	            rotateRight(array, n);
	        } else {
	            System.out.println("Invalid direction. Please choose 'left' or 'right'.");
	            return; // Exit if direction is invalid
	        }

	        // Print the rotated array
	        System.out.println("Rotated array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    // Rotate array to the left
	    private static void rotateLeft(int[] array, int n) {
	        reverse(array, 0, n - 1);
	        reverse(array, n, array.length - 1);
	        reverse(array, 0, array.length - 1);
	    }

	    // Rotate array to the right
	    private static void rotateRight(int[] array, int n) {
	        reverse(array, array.length - n, array.length - 1);
	        reverse(array, 0, array.length - n - 1);
	        reverse(array, 0, array.length - 1);
	    }

	    // Helper method to reverse part of an array
	    private static void reverse(int[] array, int start, int end) {
	        while (start < end) {
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}


