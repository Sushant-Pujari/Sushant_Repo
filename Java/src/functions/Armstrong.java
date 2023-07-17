package functions;

public class Armstrong {
	public static void main(String[] args) {
//		armstrong(6);
//		armstrong(8);
		int a=10;
		boolean b=armstrong1(a);
		validation(b);

	}

	public static void armstrong(int a) {
		System.out.println("With Argument");
		int temp=a,temp1=a,sum=0,count=0,prod=1;
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
			temp1=temp1/10;
		}
		if(sum==a) {
			System.out.println(a+" Given no.is Armstromg");
		}
		else {
			System.out.println(a+" Given no.is Not Armstromg");
		}

	}
	
	public static void armstrong1() {
		System.out.println("Without Argument");
		int a=100, temp=a,temp1=a,sum=0,count=0,prod=1;
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
			temp1=temp1/10;
		}
		if(sum==a) {
			System.out.println(a+" Given no.is Armstromg");
		}
		else {
			System.out.println(a+" Given no.is Not Armstromg");
		}

	}
	public static void validation(boolean b) {
		if(b) {
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is Armstrong");
		}
	}
	public static Boolean armstrong1(int a) {
		System.out.println("With Argument,with return");
		int temp=a,temp1=a,sum=0,count=0,prod=1;
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
			temp1=temp1/10;
		}
		if(sum==a) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean armstrong4() {
		System.out.println("Without Argument,with return");
		int a=100, temp=a,temp1=a,sum=0,count=0,prod=1;
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
			temp1=temp1/10;
		}
		if(sum==a) {
			return true;
		}
		else {
			return false;
		}
	}

}
