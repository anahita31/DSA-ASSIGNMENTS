package ASSIGNMENT1;

import java.util.Scanner;

public class Q10 {
	public static double sumColumn(double[][] a, double b) {
		double sum=0;
		double r =a.length;
		double c=a[0].length;
		for (int i=0; i<c; i++) {
			
			for (int j=0; j<r; j++) {
				sum = sum+a[j][i];
	
		System.out.println(a[j][i]+"");
	}
			System.out.println(sum);
		}
			return sum;
	}
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number of rows and columns");
    double r = sc.nextDouble();
	double c=sc.nextDouble();
	double b = 0;
	double [][]a = new double[(int) r][(int) c];
	for (int i=0; i<r; i++) {
		for (int j=0; j<c; j++) {
		a[i][j]= sc.nextDouble();
	}
}
	System.out.println(sumColumn(a,b));
}
}
