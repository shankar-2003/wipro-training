package wiprotraining;

public class PrimitiveVsReference {
	    public static void main(String[] args) {
	        // Primitive variable example
	        int a = 10;
	        int b = a; // Value of 'a' is copied to 'b'
	        System.out.println("Before modifying 'b': a = " + a + ", b = " + b);
	        b = 20; // Changing 'b' does not affect 'a'
	        System.out.println("After modifying 'b': a = " + a + ", b = " + b);

	        // Reference variable example
	        StringBuilder str1 = new StringBuilder("Hello");
	        StringBuilder str2 = str1; // 'str2' references the same object as 'str1'
	        System.out.println("Before modifying 'str2': str1 = " + str1 + ", str2 = " + str2);
	        str2.append(" World"); // Modifying 'str2' affects 'str1'
	        System.out.println("After modifying 'str2': str1 = " + str1 + ", str2 = " + str2);
	    }
	}

