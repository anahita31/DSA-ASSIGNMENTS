package ASSIGNMENT2;

import java.util.Scanner;

interface Sports {
    int score1 = 20;
    int score2 = 30;
}

class Student {
    protected String name;
    protected int roll;

    public void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine(); 
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Test extends Student {
    protected int mark1;
    protected int mark2;
    public void inputDetails(Scanner sc) {
        super.inputDetails(sc);
        System.out.print("Enter mark1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        mark2 = sc.nextInt();
        sc.nextLine(); 
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
class Result extends Test implements Sports {
    public void findGrandTotal() {
        int totalMarks = mark1 + mark2;
        int totalScore = score1 + score2;
        int grandTotal = totalMarks + totalScore;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Sports Score: " + totalScore);
        System.out.println("Grand Total: " + grandTotal);
    }
}
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        r.inputDetails(sc);
        r.showDetails();
        r.findGrandTotal();
        sc.close();
    }
}
