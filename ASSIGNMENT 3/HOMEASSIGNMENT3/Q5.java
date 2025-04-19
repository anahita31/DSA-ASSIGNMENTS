package HOMEASSIGNMENT3;

public class Q5 {
	public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s; // base case: empty or one-char string
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "pots&pans";
        String reversed = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
	}
 
