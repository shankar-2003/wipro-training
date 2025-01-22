package com.wiprotraining;

public class VariableShadowing {

	

	    // Class-level variables
	    int instanceVar = 10;  // Instance variable
	    static int staticVar = 20; // Static variable

	    public void demonstrateShadowing(int instanceVar) { // Parameter shadows instanceVar
	        // Shadowing class-level instance variable with method parameter
	        System.out.println("Method parameter instanceVar: " + instanceVar);
	        System.out.println("Class-level instanceVar (using this): " + this.instanceVar);

	        // Shadowing static variable within a block
	        {
	            int staticVar = 50; // Shadows staticVar at class level
	            System.out.println("Block-level staticVar: " + staticVar);
	            System.out.println("Class-level staticVar (using class name): " + VariableShadowing.staticVar);
	        } // End of block
	    } // End of demonstrateShadowing method

	    public static void main(String[] args) {
	        VariableShadowing obj = new VariableShadowing();

	        // Shadowing at method and block level
	        obj.demonstrateShadowing(100);

	        // Access class-level variables directly
	        System.out.println("Class-level instanceVar: " + obj.instanceVar);
	        System.out.println("Class-level staticVar: " + staticVar);
	    } // End of main method
	} // End of class
