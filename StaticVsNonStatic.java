package com.wiprotraining;

public class StaticVsNonStatic {
	

	    // Static variable
	    static int staticVar = 0;

	    // Non-static (instance) variable
	    int nonStaticVar = 0;

	    // Method to increment and display variables
	    public void displayValues() {
	        // Increment both variables
	        staticVar++;
	        nonStaticVar++;
	        
	        // Print their current values
	        System.out.println("Static Variable: " + staticVar);
	        System.out.println("Non-Static Variable: " + nonStaticVar);
	    }

	    public static void main(String[] args) {
	        // Create first object
	        StaticVsNonStatic obj1 = new StaticVsNonStatic();
	        System.out.println("Object 1:");
	        obj1.displayValues();

	        // Create second object
	        StaticVsNonStatic obj2 = new StaticVsNonStatic();
	        System.out.println("\nObject 2:");
	        obj2.displayValues();

	        // Display values through class name
	        System.out.println("\nAccessing static variable using class name:");
	        System.out.println("Static Variable: " + StaticVsNonStatic.staticVar);
	    }
	}

