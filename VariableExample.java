package wiprotraining;

public class VariableExample {

	    // Instance variable
	    int instanceVar;

	    // Static variable
	    static int staticVar;

	    public void showVariables() {
	        // Local variable
	        int localVar = 10; 
	        
	        // Print values of the variables
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);

	        // Modify instance and static variables
	        instanceVar += 5;
	        staticVar += 10;
	    }

	    public static void main(String[] args) {
	        // Create two objects of the class
	        VariableExample obj1 = new VariableExample();
	        VariableExample obj2 = new VariableExample();

	        System.out.println("--- Using obj1 ---");
	        obj1.showVariables();

	        System.out.println("--- Using obj2 ---");
	        obj2.showVariables();
	    }
	}