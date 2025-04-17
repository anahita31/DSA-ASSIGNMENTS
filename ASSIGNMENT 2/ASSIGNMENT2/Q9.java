package ASSIGNMENT2;
class Employee {
	String name;
	long salary;
	Employee (String name , long salary){
		this.name = name;
		this.salary = salary;
	}
	void displayEmployeeInfo() {
		System.out.println(name + " " + salary + " ");
	}
	}

class Manager extends Employee {
	String department;
	Manager(String name , long salary , String department){
		super(name , salary);
	}
	void displayManagerDetails() {
		super.displayEmployeeInfo();
		System.out.println(department);
	}
}

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Manager obj1 = new Manager("Anahita Singh" , 1000000000, "A2");
        obj1.displayManagerDetails();
        
	}

}
