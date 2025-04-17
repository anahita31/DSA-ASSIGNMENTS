package HOMEASSIGNMENT2;

import java.util.Scanner;

class student {
	String name;
	int roll;
	int dsamark;
	student(String name , int roll , int dsamark){
		this.name=name;
		this.roll = roll;
		this.dsamark = dsamark;
	}
	void getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll Number: ");
        roll = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter DSA Mark: ");
        dsamark = Integer.parseInt(sc.nextLine());
    }
	
	void showdata() {
		System.out.println(name + " " + roll + " " + dsamark + " ");
		
	}
	
}
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        student[] students = new student[5];
        System.out.println("Enter details for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            System.out.print("Enter Roll Number: ");
            int roll = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter DSA Mark: ");
            int dsamark = Integer.parseInt(sc.nextLine());

            students[i] = new student(name, roll, dsamark);
        }
        int highest = students[0].dsamark;
        for (int i = 1; i < 5; i++) {
            if (students[i].dsamark > highest) {
                highest = students[i].dsamark;
            }
        }
        System.out.println("\nStudent(s) with the highest DSA Mark (" + highest + "):");
        for (int i = 0; i < 5; i++) {
            if (students[i].dsamark == highest) {
                students[i].showdata();
            }
        }
            }
        }

