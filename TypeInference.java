package wiprotraining;

public class TypeInference {
		
	    public static void main(String[] args) {
	        // Using var for different types
	        var message = "Hello, Java 10!"; // Inferred as String
	        var number = 42;                // Inferred as int
	        var decimal = 3.14;             // Inferred as double
	        var isJavaFun = true;           // Inferred as boolean

	        System.out.println("Message: " + message);
	        System.out.println("Number: " + number);
	        System.out.println("Decimal: " + decimal);
	        System.out.println("Is Java fun? " + isJavaFun);

	        // var with collections
	        var numbersList = java.util.List.of(1, 2, 3, 4); // Inferred as List<Integer>
	        System.out.println("Numbers List: " + numbersList);

	        // Enhanced for loop with var
	        for (var num : numbersList) {
	            System.out.println("List Item: " + num);
	        }

	        // Using var with complex objects
	        var person = new Person("John", 30); // Inferred as Person
	        System.out.println("Person: " + person);
	    }
	}

	// Supporting class
	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age;
	    }
	}
