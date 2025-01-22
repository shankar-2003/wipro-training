package wiprotraining;

	import java.util.Scanner;

	public class FrequencyOfElements {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();

	        // Declare and input the array elements
	        int[] arr = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Find and print the frequency of each element
	        findFrequency(arr);
	    }

	    public static void findFrequency(int[] arr) {
	        int size = arr.length;

	        // Traverse the array for each element
	        for (int i = 0; i < size; i++) {
	            int count = 1;

	            // Skip already counted elements
	            if (arr[i] == -1) {
	                continue;
	            }

	            // Count the frequency of the current element
	            for (int j = i + 1; j < size; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j] = -1; // Mark the element as counted
	                }
	            }

	            // Print the frequency of the current element
	            System.out.println("Element " + arr[i] + " appears " + count + " time(s).");
	        }
	    }
	}
