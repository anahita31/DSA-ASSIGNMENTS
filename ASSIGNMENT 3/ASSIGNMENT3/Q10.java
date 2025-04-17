package ASSIGNMENT3;

public class Q10 {
    static int findFibo(int n) {
    	if(n==0||n==1) {
    		return n;
    	}else {
    		return findFibo(n-1)+findFibo(n-2);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 10;
        System.out.println(findFibo(n));
	}

}
