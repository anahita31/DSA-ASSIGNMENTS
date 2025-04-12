package assignment2;
class deposit{
	long principal;
	int time;
	double rate;
	double totalamnt;
	deposit(){
	}
	deposit(long principal,int time,double rate){
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}deposit(long principal,int time){
		this.principal=principal;
		this.time=time;
	}deposit(long principal,double rate){
		this.principal=principal;
		this.rate=rate;
	}void display(){
		System.out.println("principal = "+principal);
		System.out.println("time = "+time);
		System.out.println("rate = "+rate);
	}void calc_amnt(){
		System.out.println("total amount to be paid: "+(principal+(principal*rate*time)/100));
	}
}
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposit obj=new deposit(10000,2,10);
		obj.display();
		obj.calc_amnt();
	}

}
