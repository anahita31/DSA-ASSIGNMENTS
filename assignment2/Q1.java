package assignment2;
import java.util.Scanner;
class car{
	String model;
	int year;
	void setDetails(String model,int year) {
		this.model=model;
		this.year=year;
	}void displayDetails(){
		System.out.println("car model is "+model+" and year is "+year);
	}
}                                                                                                                                                                                                                                                                   
public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		car obj1=new car();
		obj1.model="Toyota";
		obj1.year=2020;
		System.out.println("Enter model and year of second car: ");
		String model=sc.next();
		int year=sc.nextInt();
		car obj2=new car();
		obj2.setDetails(model,year);
		obj1.displayDetails();
		obj2.displayDetails();
		if(obj1.year>obj2.year) {
			System.out.println(obj1.model+" is newer");
		}else {
			System.out.println(obj2.model+" is newer");
		}
		
		
		
		

	}

}
