package ASSIGNMENT3;

import java.util.Scanner;

public class Q8 {
    static int power(int base , int p) {
    	if(p==1) {
    		return base;
    	}else {
    		return base*power(base,p-1);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the power");
        int p = sc.nextInt();
        System.out.println("Solution = " + power(base,p));
        
	}

}
