package HOMEASSIGNMENT3;

public class Q8 {
	    public static void solveTowers(int n, char source, char temp, char destination) {
	        if (n == 1) {
	            
	            System.out.println("Move disk 1 from " + source + " to " + destination);
	        } else {
	            solveTowers(n - 1, source, destination, temp);
	            System.out.println("Move disk " + n + " from " + source + " to " + destination);
	            solveTowers(n - 1, temp, source, destination);
	        }
	    }
	public static void main(String[] args) {
		int n = 4;
        System.out.println("Steps to solve Towers of Hanoi with " + n + " disks:");
        solveTowers(n, 'A', 'B', 'C');
    }
}
	
