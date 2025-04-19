package HOMEASSIGNMENT3;

public class Q4 {
    
    public static int product(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b < 0) {
            return a -product(a, -b);
        }
        return a + product(a, b - 1);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Product of " + a + " and " + b + " is: " + product(a, b));
    }
}

