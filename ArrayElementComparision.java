package com.wiprotraining;


	import java.util.Scanner;

	public class  ArrayElementComparision {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get size of the arrays
	        System.out.print("Enter the size of the arrays: ");
	        int size = scanner.nextInt();

	        // Initialize the arrays
	        int[] array1 = new int[size];
	        int[] array2 = new int[size];

	        // Get elements for the first array
	        System.out.println("Enter the elements of the first array:");
	        for (int i = 0; i < size; i++) {
	            array1[i] = scanner.nextInt();
	        }

	        // Get elements for the second array
	        System.out.println("Enter the elements of the second array:");
	        for (int i = 0; i < size; i++) {
	            array2[i] = scanner.nextInt();
	        }

	        // Compare the arrays element by element
	        for (int i = 0; i < size; i++) {
	            // Compare elements using conditional operators
	            String result = (array1[i] == array2[i]) ? "equal" :
	                            (array1[i] > array2[i]) ? "greater" : "lesser";
	            System.out.println("Element " + (i + 1) + ": " + array1[i] + " is " + result + " than " + array2[i]);
	        }
	    }
	}


