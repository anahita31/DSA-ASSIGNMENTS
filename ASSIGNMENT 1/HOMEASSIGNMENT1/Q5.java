package HOMEASSIGNMENT1;

import java.util.Random;

public class Q5 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
        Random random = new Random();

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2); // 0 or 1
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "   ");
            }
            System.out.println();
        }

        // Find the row with the most 1s
        int maxRowIndex = 0;
        int maxRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRowIndex = i;
            }
        }

        // Find the column with the most 1s
        int maxColIndex = 0;
        int maxColCount = 0;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxColCount) {
                maxColCount = count;
                maxColIndex = j;
            }
        }

        System.out.println("\nThe largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}


		        