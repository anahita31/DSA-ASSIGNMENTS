package ASSIGNMENT2;
 class Vehicle {
	String model;
	int year;
	Vehicle(String model , int year ) {
		this.model=model;
		this.year=year;
	}
 }
	class car1 extends Vehicle {
		int carId;
		double price;
	car1(String model , int year , int carId , double price) {
			super(model , year);
			this.carId = carId;
			this.price = price;
		}
		void carDisplay() {
			System.out.println(model + " " + year + " " + carId + " " + price + " ");
		}
	}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        car1 obj1 = new car1("toyota" , 2024 , 20,10000000.0);
        obj1.carDisplay();
	}
}
 
