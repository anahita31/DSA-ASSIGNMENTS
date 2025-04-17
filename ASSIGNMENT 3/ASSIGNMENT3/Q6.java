package ASSIGNMENT3;

public class Q6 {
    public static<T> int count(T[] array,T item) {
    	int count = 0;
    	for (T x: array) {
    		if(x==item) {
    			count++;
    		}
    	}
    	return count;
    	}
    public static void main(String[] args) {
    	Integer[] a= new Integer[] {1,2,3,4,5,1,1,1,1,1};
    	System.out.println(count(a,1));
    }
    }