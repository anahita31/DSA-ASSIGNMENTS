package ASSIGNMENT2;
class Book {
    private int bookId;
    private double price;
    private int quantity;

    static double totalAmount = 0;
    public Book(int bookId, double price, int quantity) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
        totalAmount += getTotalCost();
    }
    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
        System.out.println("-----------------------------");
    }
    public double getTotalCost() {
        return price * quantity;
    }
}

public class Q3 {

	public static void main(String[] args) {
		Book[] books = new Book[5];
        books[0] = new Book(101, 250.50, 2);
        books[1] = new Book(102, 150.00, 1);
        books[2] = new Book(103, 99.99, 3);
        books[3] = new Book(104, 450.75, 1);
        books[4] = new Book(105, 300.00, 2);
        for (Book book : books) {
            book.displayDetails();
        }
        System.out.println("Total Amount Spent on All Books: " + Book.totalAmount);
    }
}