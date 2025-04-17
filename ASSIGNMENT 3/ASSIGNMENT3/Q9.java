package ASSIGNMENT3;

public class Q9 {
    public static void reverse(int n) {
    	if(n==0) {
    		return;
    	}
    		System.out.println(n%10);
    		reverse(n/10);
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        reverse (12345);
	}

}
