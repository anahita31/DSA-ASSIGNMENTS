package HOMEASSIGNMENT1;

public class Q4 {

	public static void main(String[] args) {
		  double[][] a = {
		            {1.2, 2.3},
		            {3.4, 4.5}
		        };
		        
		        double[][] b = {
		            {5.6, 6.7},
		            {7.8, 8.9}
		        };

		        double[][] result = addMatrix(a, b);

		        if (result != null) {
		            System.out.println("Matrix sum:");
		            for (double[] row : result) {
		                for (double val : row) {
		                    System.out.print(val + " ");
		                }
		                System.out.println();
		            }
		        }
		    }

		    public static double[][] addMatrix(double[][] a, double[][] b) {
		        int rows = a.length;
		        int cols = a[0].length;

		        // Check if dimensions match
		        if (b.length != rows || b[0].length != cols) {
		            System.out.println("Error: Matrices must have the same dimensions.");
		            return null;
		        }

		        double[][] sum = new double[rows][cols];

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                sum[i][j] = a[i][j] + b[i][j];
		            }
		        }

		        return sum;
		    }
}

		      