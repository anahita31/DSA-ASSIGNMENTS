package assignment1;

import java.util.Scanner;

public class Q6 {
	public static boolean isOdd(int n) {
		if( (n&001)==1) {
			return (true);	
		}else {
			return (false);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println(isOdd(n));

	}

}
