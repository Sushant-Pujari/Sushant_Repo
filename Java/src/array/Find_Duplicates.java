package array;

import java.util.Scanner;

public class Find_Duplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size= sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					for(int k=i-1;k>=0;k--) {
						if(a[k]==a[i]) {
							count--;
						}
						
					}
				}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}
	}

}
