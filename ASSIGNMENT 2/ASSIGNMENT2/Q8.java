package ASSIGNMENT2;
interface Flyable {
	void fly();
}
interface Swimmable {
	void swim();
}
class Duck implements Flyable , Swimmable {
	String name;
	public Duck (String name) {
		this.name=name;
	}
	public void fly () {
		System.out.println("Duck can fly");
	}
	public void swim() {
		System.out.println("Duck can swim");
	}
	void displayDetails() {
		System.out.println(name);
	}
		
	}

	
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Duck obj1 = new Duck("abcd");
        obj1.displayDetails();
        obj1.fly();
        obj1.swim();
	}

}
