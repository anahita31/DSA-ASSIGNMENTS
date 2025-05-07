package ASSIGNMENT1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[]a={'C','A','R','B','O','N'};
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				for (int k=0;k<6;k++) {
					for (int l=0;l<6;l++) {
						for (int m=0;m<6;m++) {
							for (int n=0;n<6;n++) {
					if(i!=j && i!=k && i!=l && i!=m && i!=n && 
							j!=k && j!=l && j!=m && j!=n &&
							k!=l && k!=m && k!=n &&
							l!=m && l!=n &&
							m!=n) {
						System.out.println(""+a[i]+a[j]+a[k]+a[l]+a[m]+a[n]);
					}
							}
						}
					}
				}
			}
		}
	}
}

