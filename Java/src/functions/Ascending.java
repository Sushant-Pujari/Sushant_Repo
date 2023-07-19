package functions;

public class Ascending {
	public static void main(String[] args) {
		int a[] = { 50,40,30,20,10, };
		ascend();
		ascend1(a);
		int a2[] = { 50,40,30,20,10, };
		int []b=ascend2(a2);
		display(b);
	}
	public static void ascend() {
		System.out.println("Without Argument");
		int a[] = { 50,40,30,20,10, };
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {

					a[i]=a[j]+a[i];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];

				}

			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void ascend1(int a[]) {
		System.out.println("With Argument");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {

					a[i]=a[j]+a[i];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];

				}

			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static int [] ascend2(int a[]) {
		System.out.println("With Argument");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {

					a[i]=a[j]+a[i];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];

				}

			}
		}
		return a;
		
	}
	public static void display(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
