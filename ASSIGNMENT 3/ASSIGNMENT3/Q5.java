package ASSIGNMENT3;

public class Q5 {
	public static <E>void printArray(E[] inputArray) {
    	for(E a:inputArray) {
    		System.out.println(a);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[]a= {34,45,78,8,9};
        printArray(a);
        String b[]= {"Hi","Bye"};
        printArray(b);
	}
}
