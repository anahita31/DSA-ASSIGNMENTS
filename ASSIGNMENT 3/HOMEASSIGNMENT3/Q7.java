package HOMEASSIGNMENT3;
import java.util.Arrays;
public class Q7 {

	    public static void partition(int[] A, int k) {
	        partitionHelper(A, 0, A.length - 1, k);
	    }
	     static void partitionHelper(int[] A, int left, int right, int k) {
	        if (left >= right) {
	            return;
	        }
	        if (A[left] > k && A[right] <= k) {
	            int temp = A[left];
	            A[left] = A[right];
	            A[right] = temp;
	            partitionHelper(A, left + 1, right - 1, k);
	        }
	        else if (A[left] <= k) {
	            partitionHelper(A, left + 1, right, k);
	        }
	        else {
	            partitionHelper(A, left, right - 1, k);
	        }
	     }
	    public static void main(String[] args) {
	        int[] A = {9, 3, 7, 1, 8, 2, 5, 6};
	        int k = 5;
	        partition(A, k);
	        System.out.println(Arrays.toString(A)); 
	    }
	}


