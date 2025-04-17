package ASSIGNMENT2;
class deposit {
	long principal;
	int time;
	double rate;
	double totalamt;
	deposit(long principal , int time , double rate , double totalamt){
		this.principal = principal;
		this.time = time;
		this.rate = rate;
		this.totalamt = totalamt;
	}
	deposit(long principal , int time , double rate){
		this.principal = principal;
		this.time = time;
		this.rate = rate;
	}
	deposit(long principal , int time){
		this.principal = principal;
		this.time = time;
	}
	deposit(long principal , double rate){
		this.principal = principal;
		this.rate = rate;
	}
	void display() {
		System.out.println(principal + " ");
		System.out.println(time + " ");
		System.out.println(rate + " ");
	}
	void calcamt() {
		System.out.println(" the total amount to be paid " + principal + " " + (principal*rate*time)/100);
	}
	}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        deposit obj1 = new deposit(100000,2,10);
        obj1.display();
        obj1.calcamt();
	}

}
