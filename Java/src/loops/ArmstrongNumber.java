package loops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int temp=num,temp1=num,count=0,prod=1,sum=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		while(temp1>0) {
			prod=1;
			int mod=temp1%10;
			for(int i=1;i<=count;i++) {
				prod=prod*mod;
			}
			sum=sum+prod;
			temp1=temp/10;
		}
		if(sum==num) {
			System.out.println("Givem number is Armstromg number");
		}
		else {
			System.out.println("Given nuber is not Armstrong number");
		}
	}

}
