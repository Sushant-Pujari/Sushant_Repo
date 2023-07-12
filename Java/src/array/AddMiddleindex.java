package array;

import java.util.Scanner;

public class AddMiddleindex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size= sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Element which you want add");
		int neww=sc.nextInt();
		System.out.println("Enter element where you want add ");
		int pos=sc.nextInt();
		int i;
		for(i=0;i<arr.length;i++) {
			if(pos==arr[i]) {
				for(int j=arr.length-1;j>i;j--) {
					arr[j]=arr[j-1];
				}
				break;
			}
		}
		arr[i]=neww;
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}

}
