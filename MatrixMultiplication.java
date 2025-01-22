package wiprotraining;

	import java.util.Scanner;

	public class MatrixMultiplication {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input dimensions of the first matrix
	        System.out.print("Enter the number of rows of the first matrix: ");
	        int rows1 = scanner.nextInt();
	        System.out.print("Enter the number of columns of the first matrix: ");
	        int cols1 = scanner.nextInt();
	        
	        // Input dimensions of the second matrix
	        System.out.print("Enter the number of rows of the second matrix: ");
	        int rows2 = scanner.nextInt();
	        System.out.print("Enter the number of columns of the second matrix: ");
	        int cols2 = scanner.nextInt();
	        
	        // Validate if matrix multiplication is possible
	        if (cols1 != rows2) {
	            System.out.println("Matrix multiplication is not possible. The number of columns of the first matrix must be equal to the number of rows of the second matrix.");
	            return;
	        }
	        
	        // Initialize matrices
	        int[][] matrix1 = new int[rows1][cols1];
	        int[][] matrix2 = new int[rows2][cols2];
	        int[][] result = new int[rows1][cols2];
	        
	        // Input elements for the first matrix
	        System.out.println("Enter elements of the first matrix:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols1; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // Input elements for the second matrix
	        System.out.println("Enter elements of the second matrix:");
	        for (int i = 0; i < rows2; i++) {
	            for (int j = 0; j < cols2; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // Matrix multiplication
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        
	        // Output the result
	        System.out.println("Result of matrix multiplication:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

