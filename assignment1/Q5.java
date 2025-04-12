package assignment1;
import java.util.Scanner;
public class Q5 {
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			n=n/10;	
		}return(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=n;
		while (sum>9) {
			sum=sum_Of_Digits(sum);
		}System.out.println(sum);
		

	}

}
