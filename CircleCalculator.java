package com.wiprotraining;

public class CircleCalculator {
	
	    // Define a constant for PI
	    static final double PI = 3.14159;

	    public static void main(String[] args) {
	        // Radius of the circle
	        double radius = 5.0;

	        // Calculate area and circumference using the constant PI
	        double area = PI * radius * radius;
	        double circumference = 2 * PI * radius;

	        // Print the results
	        System.out.println("Radius of the circle: " + radius);
	        System.out.println("Area of the circle: " + area);
	        System.out.println("Circumference of the circle: " + circumference);
	    }
	}


