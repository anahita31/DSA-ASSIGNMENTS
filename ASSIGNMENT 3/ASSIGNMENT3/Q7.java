package ASSIGNMENT3;

import java.util.Scanner;

public class Q7 {
    static int findFact(int n) {
    	if(n==1) {
    		return 1;
    	}else {
    		return n*findFact(n-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(findFact(n));
	}

}
