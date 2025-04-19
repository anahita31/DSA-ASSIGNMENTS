package HOMEASSIGNMENT3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int decimal = 19;
        System.out.println("Binary of " +decimal + " is: ");
        printBinary(decimal);
	}
	public static void printBinary(int n) {
		if(n==0) {
			return;
		}
		printBinary(n/2);
		System.out.print(n%2);
	}
}
