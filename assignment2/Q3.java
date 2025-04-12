package assignment2;
import java.util.Scanner;
class book{
	int bookid;
	double price;
	int quantity;
	static double totalAmount;
	book(int bookid,double price,int quantity){
		this.bookid=bookid;
		this.price=price;
		this.quantity=quantity;
	}void displayDetails(){
		System.out.println("Book id:"+bookid+" Price is "+price+" Quantity= "+quantity);
	}double calculateCost(){
		return(price*quantity);
	}
}
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		book obj[]=new book[5];
		for(int i=0;i<5;i++) {
			System.out.println("enter the bookid,price and quantity: ");
			int bookid=sc.nextInt();
			double price=sc.nextDouble();
			int quantity=sc.nextInt();
			obj[i]=new book(bookid,price,quantity);
			obj[i].displayDetails();
			book.totalAmount=book.totalAmount+obj[i].calculateCost();	
		}System.out.println("total amount of all books: "+book.totalAmount);

	}

}
