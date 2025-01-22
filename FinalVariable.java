package wiprotraining;

public class FinalVariable {

	    // Final instance variable
	    final int instanceVariable;

	    // Final static variable
	    static final int STATIC_FINAL_VARIABLE = 100;

	    // Constructor to initialize the final instance variable
	    public FinalVariable(int value) {
	        instanceVariable = value; // Must be initialized either here or during declaration
	    }

	    public void demonstrateFinalVariable() {
	        // Local final variable
	        final int localFinalVariable = 50;
	        System.out.println("Local final variable: " + localFinalVariable);

	        // Uncommenting the next line will cause a compile-time error
	        // localFinalVariable = 60; 

	        System.out.println("Instance final variable: " + instanceVariable);

	        // Uncommenting the next line will cause a compile-time error
	        // instanceVariable = 40; 

	        System.out.println("Static final variable: " + STATIC_FINAL_VARIABLE);

	        // Uncommenting the next line will cause a compile-time error
	        // STATIC_FINAL_VARIABLE = 200; 
	    }

	    public static void main(String[] args) {
	        FinalVariable example = new FinalVariable(30);
	        example.demonstrateFinalVariable();

	        // Final reference variable
	        final StringBuilder finalStringBuilder = new StringBuilder("Initial");
	        System.out.println("Final reference variable content: " + finalStringBuilder);

	        // Modifying the object content is allowed
	        finalStringBuilder.append(" Content");
	        System.out.println("Modified content: " + finalStringBuilder);

	        // Uncommenting the next line will cause a compile-time error
	        // finalStringBuilder = new StringBuilder("New Reference");
	    }
	}

