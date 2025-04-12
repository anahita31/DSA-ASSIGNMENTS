package assignment2;
class employee{
	String name;
	int salary;
	employee(String name,int salary){
		this.name=name;
		this.salary=salary;		
	}void displayEmployeeInfo(){
		System.out.println(name);
		System.out.println(salary);
	}
}class manager extends employee{
	String department;
	manager(String name,int salary,String department){
		super(name,salary);
		this.department=department;
	}void displayManagerDetails(){
		super.displayEmployeeInfo();
		System.out.println(department);
	}
	
}
public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager obj=new manager("ankur",20000,"IT");
		obj.displayManagerDetails();

	}

}
