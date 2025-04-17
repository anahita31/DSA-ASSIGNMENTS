package ASSIGNMENT2;
class shape {
	String color;
	shape(String color){
		this.color = color;
	}
}
	class circle extends shape{
		double rad;
		public circle (String color , double rad) {
			super(color);
			this.rad=rad;
		}
		double areaCircle() {
			return (( Math.PI)*rad*rad);
		}
		void display() {
			System.out.println(color +" "+rad+" "+areaCircle());
		}
	}
		class rectangle extends shape{
			double length;
			double width;
			public rectangle (String color , double length , double width) {
				super(color);
				this.length = length;
				this.width = width;
			}
			double area() {
				return (length*width);
			}
		    void display(){
			System.out.println(color + " " + length + " " + width + " " + area());
		}
			
		}
	
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        circle obj1 = new circle("RED", 21);
        rectangle obj2 = new rectangle ("GREEN",20,20);
        obj1.display();
        obj2.display();
	}
}

