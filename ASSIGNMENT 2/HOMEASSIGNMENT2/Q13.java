package HOMEASSIGNMENT2;
import java.util.Scanner;

class bank {
	String bankname;
	double depositamount;
	static double totalamount = 0;
	void setBankName(String name) {
		this.bankname = bankname;
	}
	void setAmount(double depositamount) {
		if(depositamount>=1000) {
		this.depositamount = depositamount;
		totalamount  = totalamount+ depositamount;
		}else {
			System.out.println("Minimum deposit amount must be at least 1000. Deposit not added");
	}
	}
		
	void showData() {
		System.out.println(bankname + " " + depositamount + " ");
	}
double getDepositAmount() {
	return depositamount;
}
String getBankName() {
	return bankname;
}
}
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        bank[] banks = new bank[5];
        for (int i = 0; i<5; i++) {
        	banks[i] = new bank();
        	System.out.println("Enter name of bank " + (i+1) + ":");
        	String name = sc.nextLine();
        	banks[i].setBankName(name);

            System.out.print("Enter deposit amount (minimum 1000): ");
            double amount = Double.parseDouble(sc.nextLine());
            banks[i].setAmount(amount);
        }

        // Output bank-wise
        System.out.println("\nBank Details:");
        for (int i = 0; i < 5; i++) {
            banks[i].showData();
        }
        System.out.println("Total Amount Deposited: " + bank.totalamount);
        bank minBank = banks[0];
        for (int i = 1; i < 5; i++) {
            if (banks[i].getDepositAmount() < minBank.getDepositAmount()) {
                minBank = banks[i];
            }
        }

        System.out.println("Bank with Minimum Deposit:");
        System.out.println("Bank Name: " + minBank.getBankName() + ", Amount: " + minBank.getDepositAmount());

        }
	}



