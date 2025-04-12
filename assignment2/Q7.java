package assignment2;
import java.util.Scanner; 
class shape{
	String colour;
	shape(String colour){
		this.colour=colour;
	}
}
class circle extends shape{
	double rad;
	circle(double rad,String colour) {
		super(colour);
		this.rad=rad;
	}double area(){
		return Math.PI*rad*rad;
	}void display(){
		System.out.println("Colour of circle "+colour+"\nRadius of circle "+rad+"\nArea of circle "+area());
	}
}class rectangle extends shape{
	double l;
	double w;
	rectangle(double l, double w, String colour) {
		super(colour);
		this.l=l;
		this.w=w;
	}double area(){
		return l*w;
	}void display(){
		System.out.println("Colour of rectangle "+colour+"\nLength of the rectangle "+l+"\nWidth of the rectangle "+w+"\nArea of rectangle "+area());
	}
}public class Q7{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj1=new circle(22,"Red");
		rectangle obj2=new rectangle(11,12,"Red");
		obj1.display();
		obj2.display();
		

	}

}
