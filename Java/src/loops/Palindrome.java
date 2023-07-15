package loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num,rev=0;
		while(temp>0) {
			int mod=temp%10;
			rev=(rev*10)+mod;
			temp=temp/10;
		}
		if(rev==num) {
			System.out.println(num+" is Palindrome");
		}
		else {
			System.out.println(num+" is not Palindrome");
		}
	}

}
