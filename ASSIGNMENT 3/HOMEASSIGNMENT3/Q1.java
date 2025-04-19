package HOMEASSIGNMENT3;

public class Q1 {
    public static int findGcd(int m , int n) {
    	if (n==0) {
    		return m;
    	}else {
    		return findGcd(n , m%n);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m = 48;
        int n = 18;
        int result = findGcd(m,n);
        System.out.println("GCD of " + m + " and " + n + " is: " + result);
        
        
	}

}
