package HOMEASSIGNMENT2;
class person {
	String name;
	int age;
	person (String name , int age) {
		this.name = name;
		this.age = age;
	}
}
	class Employee extends person {
        int eid;
		double salary;
		
		Employee(String name , int age , int eid , double salary){
			super(name,age);
			this.eid =eid;
			this.salary=salary;
		}
	void empDisplay() {
		System.out.println(name + " " + age + " " + eid + " " + salary + " ");
	}
	}
	
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee("Anahita", 18, 1001, 55000.75);
		System.out.println("Employee Details:");
		obj.empDisplay();

	}

}
