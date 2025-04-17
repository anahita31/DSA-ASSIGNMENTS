package HOMEASSIGNMENT2;
class distance {
	int feet;
	int inches;
	distance (int feet , int inches){
		this.feet = feet;
		this.inches = inches;
	}
	void displayDistance() {
		System.out.println(feet + " " + inches + " ");
	}
}
	class Measurement extends distance {
		double centimeters;
		Measurement (int feet , int inches , double centimeters){
			super(feet,inches);
			this.centimeters = centimeters;
		}
		void displayMeasurement() {
			super.displayDistance();
			System.out.println(centimeters);	
		}
	}

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Measurement m = new Measurement(5,8,172.72);
        m.displayMeasurement();
        
	}
}

