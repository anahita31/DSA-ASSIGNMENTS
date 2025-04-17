package assignment1;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows of 2D array: ");
		int r=sc.nextInt();
		System.out.println("Enter the no. of columns of 2D array: ");
		int c=sc.nextInt();
		System.out.println("Enter the elements of 2D array: ");
		int[][]a=new int[r][c];
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
				}
		}int sum=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+ " ");
				if(i==j) {
					sum+=a[i][j];
				}
			}
			System.out.println();
			
		}System.out.println("sum= "+sum); 

	}

}
