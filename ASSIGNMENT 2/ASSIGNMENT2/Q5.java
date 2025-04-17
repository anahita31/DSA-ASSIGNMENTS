package ASSIGNMENT2;
abstract class Shape {
 String name;

 Shape(String name) {
     this.name = name;
 }
 abstract double getArea();
}
class Square extends Shape {
 double side;

 Square(double side) {
     super("Square");
     this.side = side;
 }

 @Override
 double getArea() {
     return side * side;
 }
}

//Triangle class
class Triangle extends Shape {
 double base, height;

 Triangle(double base, double height) {
     super("Triangle");
     this.base = base;
     this.height = height;
 }
 @Override
 double getArea() {
     return 0.5 * base * height;
 }
}

class Circle extends Shape {
 double radius;
 Circle(double radius) {
     super("Circle");
     this.radius = radius;
 }
 @Override
 double getArea() {
     return Math.PI * radius * radius;
 }
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape square = new Square(5);
	     Shape triangle = new Triangle(4, 6);
	     Shape circle = new Circle(3);

	     System.out.println(square.name + " Area: " + square.getArea());
	     System.out.println(triangle.name + " Area: " + triangle.getArea());
	     System.out.println(circle.name + " Area: " + circle.getArea());
	 }
	}

