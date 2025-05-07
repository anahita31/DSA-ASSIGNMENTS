package HOMEASSIGNMENT1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the length of arrays
        System.out.print("Enter the length of the arrays: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        // Read elements of array a
        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Read elements of array b
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        // Compute dot product element-wise: c[i] = a[i] * b[i]
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        // Print the resulting array c
        System.out.println("Dot product result array c:");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }

        scanner.close();
    }
}

	