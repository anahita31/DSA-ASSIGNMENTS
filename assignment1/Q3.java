package assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("number N= ");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		while (n!=0) {
			int a=n%10;
			sum=sum+a;
			product=product*a;
			n=n/10;
		}System.out.println("Sum of the digits "+sum);
		System.out.println("Product of the digits "+product);
		if(product==sum) {
			System.out.println("it is a spy number");
		}
		

	}

}
