package assignment2;
interface Flyable{
	void fly();
}interface Swimmable{
	void swim();
}
class Duck implements Flyable,Swimmable{
	String name;
	Duck(String name){
		this.name=name;
	}public void fly() {
		System.out.println("duck can fly");
	}public void swim() {
		System.out.println("duck can swim");
	}void displayDetails(){
		System.out.println(name+""
				+ " can swim");
	}
}
public class Q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck obj1=new Duck("Danny");
		obj1.displayDetails();
		
		

	}

}
