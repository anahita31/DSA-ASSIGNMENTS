package HOMEASSIGNMENT2;
class PointType {
     double x;
     double y;
     PointType(double x, double y) {
     this.x = x;
     this.y = y;
 }
 public void setCoordinates(double x, double y) {
     this.x = x;
     this.y = y;
 }
 public void printCoordinates() {
     System.out.println("Point Coordinates: (" + x + ", " + y + ")");
 }
 public double getX() {
     return x;
 }
 public double getY() {
     return y;
 }
}
class CircleType extends PointType {
       double radius;
 public CircleType(double x, double y, double radius) {
     super(x, y); 
     this.radius = radius;
 }
 public void setRadius(double radius) {
     this.radius = radius;
 }
 public void printRadius() {
     System.out.println("Radius: " + radius);
 }
 public void printArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area: " + area);
 }
 public void printCircumference() {
     double circumference = 2 * Math.PI * radius;
     System.out.println("Circumference: " + circumference);
 }
 public void printCircleInfo() {
     printCoordinates();
     printRadius();
     printArea();
     printCircumference();
 }
}
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleType circle = new CircleType(3.0, 4.0, 5.0);
	     circle.printCircleInfo();
	     System.out.println("\nUpdating values...");
	     circle.setCoordinates(6.0, 8.0);
	     circle.setRadius(7.5);
	     circle.printCircleInfo();
	 }
	}