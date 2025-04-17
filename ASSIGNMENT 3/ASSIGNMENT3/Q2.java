package ASSIGNMENT3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String color[]= {"red","blue","green"};
        for (int i =0;i<color.length;i++) {
        	try {
        		System.out.println(color[i]);
        	}catch(ArrayIndexOutOfBoundsException e) {
        		System.out.println("you have not enough colors");
        	}catch (NullPointerException e) {
        		System.out.println("your array has a null value");
			}catch(NumberFormatException e) {
				System.out.println("your array has an invalid value");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
        		
        		
        	}
        }
	}

