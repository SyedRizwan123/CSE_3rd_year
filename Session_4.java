package CSE_1;

public class Session_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create first 2x2 matrix 'a' with values
        /*int[][] a = {{1, 2}, 
                     {3, 4}};
        
     // Create second 2x2 matrix 'b' with values
        int[][] b = {{5, 6}, 
                     {7, 8}};
        
     // Create a new 2x2 matrix 'sum' to store the result of addition
        int[][] sum = new int[2][2];
        
     // Loop through each row (i = 0 and 1)
        for (int i = 0; i < 2; i++) {

            // Loop through each column (j = 0 and 1)
            for (int j = 0; j < 2; j++) {

                // Add corresponding elements from a and b, store in sum
                // Example: sum[0][0] = a[0][0] + b[0][0] = 1 + 5 = 6
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print the final result (sum of the matrices)
        System.out.println("Sum of matrices:");

        
        // Use enhanced for loop to print each row of the result
        for (int[] row : sum) {        // for each row in sum matrix
            for (int val : row) {      // for each value in that row
                System.out.print(val + " "); // print the value with space
            }
            System.out.println();*        // move to the next line after each row
        }*/
		
		/*int matrix[][] = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		// Print a label to indicate we're showing diagonal elements
        System.out.println("Diagonal Elements:");
     // Loop through each row, using the same index for row and column
        for (int i = 0; i < 3; i++) {
            // Access the element where row index and column index are the same
            // This gives the main diagonal elements
            System.out.print(matrix[i][i] + " ");*/           //1 5 9
        
		// Step 1: Create the original matrix with 2 rows and 3 columns
		  /*int[][] original = {
		       {1, 2, 3},   // Row 0
		       {4, 5, 6}    // Row 1
		   };

		  // Step 2: Create an empty transpose matrix with 3 rows and 2 columns
		 // Because after transpose, rows become columns and columns become rows
		  int[][] transpose = new int[3][2];

		 // Step 3: Copy elements from original to transpose by swapping row and column index
		// original[i][j] becomes transpose[j][i]
		        
		 for (int i = 0; i < original.length; i++) { // Loop through rows of original (0 to 1)
		       for (int j = 0; j < original[0].length; j++) { // Loop through columns (0 to 2)
		             transpose[j][i] = original[i][j]; // Swap and assign values
		            }
		        }

		 // Step 4: Print the transposed matrix
		  System.out.println("Transposed Matrix:");
		        
		// Loop through rows of transpose matrix
		  for (int i = 0; i < transpose.length; i++) {
		// Loop through columns of transpose matrix
		  for (int j = 0; j < transpose[0].length; j++) {
		// Print each element followed by space
		   System.out.print(transpose[i][j] + " ");
		 }
		// Print a new line after each row
		   System.out.println();
		}*/
		
		// Declare a 2D array with 3 rows, but columns are not defined yet (jagged array)
        int[][] jagged = new int[3][];
        
        // Initialize the first row with 2 elements
        jagged[0] = new int[]{1, 2};          // Row 0 → [1, 2]
        
        // Initialize the second row with 3 elements
        jagged[1] = new int[]{3, 4, 5};       // Row 1 → [3, 4, 5]
        
        // Initialize the third row with 1 element
        jagged[2] = new int[]{6};             // Row 2 → [6]

        // Print the jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();  // Newline after each row
        }

		    

	}

		

	}

