package assignment1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the weight in kg: ");
		System.out.println("enter the height in m: ");
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		double bmi=w/(h*h);
		if (bmi<=18.5) {
			System.out.println("underweight");
		}else if(bmi>18.5 && bmi<=24.9) {
			System.out.println("normal weight");
		}else if(bmi>24.9 && bmi<=29.9) {
			System.out.println("overweight");
		}else {
			System.out.println("obess");
		}
		
		
	

	}

}
