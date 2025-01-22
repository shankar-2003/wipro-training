package wiprotraining;

public class VariableScopeExample {

	    // Class-level variable
	    static int classLevelVariable = 100;

	    public static void main(String[] args) {
	        // Method-level variable
	        int methodLevelVariable = 200;

	        System.out.println("Class-level variable: " + classLevelVariable);
	        System.out.println("Method-level variable: " + methodLevelVariable);

	        // Start a block
	        {
	            // Block-level variable
	            int blockLevelVariable = 300;
	            System.out.println("Block-level variable: " + blockLevelVariable);

	            // Access class-level and method-level variables inside the block
	            System.out.println("Accessing class-level variable in block: " + classLevelVariable);
	            System.out.println("Accessing method-level variable in block: " + methodLevelVariable);
	        }

	        // The following line will cause an error because blockLevelVariable is out of scope
	        // System.out.println(blockLevelVariable);
	    }

	    public static void anotherMethod() {
	        // Class-level variables are accessible here
	        System.out.println("Accessing class-level variable in anotherMethod: " + classLevelVariable);

	        // Method-level variable (from main) is not accessible here
	        // System.out.println(methodLevelVariable); // This would cause an error
	    }
	}
