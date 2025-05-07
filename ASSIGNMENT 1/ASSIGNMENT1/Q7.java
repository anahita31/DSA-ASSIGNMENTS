package ASSIGNMENT1;

public class Q7 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,2,3,4,1,2};
		int n=a.length;
		int max=a[0];
		int min=a[0];
		int maxc=0;int minc=0;
		int maxp=0;int minp=0;
		for(int i=0;i<n;i++) {
			if (a[i]>max){
				max=a[i];
				maxc=1;
				maxp=i+1;
			}else if(a[i]==max) {
				maxc++;
			}if (a[i]<min) {
				min=a[i];
				minc=1;
				minp=i+1;
			}else if(a[i]==min) {
				minc++;
				minp=i+1;
			}
		}System.out.println("max no. in the array "+max);
		System.out.println("count of max no. is "+maxc);
		System.out.println("position of max no. is "+maxp);
		System.out.println("min no. in the array "+min);
		System.out.println("count of max no. is "+minc);
		System.out.println("position of min no. is "+minp);
	}
}
