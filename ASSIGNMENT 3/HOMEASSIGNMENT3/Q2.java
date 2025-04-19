package HOMEASSIGNMENT3;

public class Q2 {
    	public static int binarySearch (int[] array, int left , int right, int target) {
    		if(left<=right) {
    			int mid = left + (right - left) /2;
    			if (array[mid] == target) {
    				return mid;
    			}
    			if (target<array[mid]) {
    			    return binarySearch(array , left, mid - 1, target);
    			}
    			return binarySearch(array, mid + 1 , right , target);
    			}
    			return-1;
    		}
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = {2,4,6,10,14,18,22,30};
        int target = 14;
        int result = binarySearch(numbers,0,numbers.length-1,target);
        if (result != -1) {
        	System.out.println("Element found at index:" + result);
        }else {
        	System.out.println("Element not found in the array.");
        }
	}
}    	

