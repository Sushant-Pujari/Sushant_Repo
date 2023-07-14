package array;

import java.util.Scanner;

public class Add_Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Hi hello how are you";
		char c[] = s.toCharArray();
		String neww = "hii";
		char c1[]=neww.toCharArray();
		String add = "hello";
		int count=0;
		char c2[] = add.toCharArray();
		for (int i = 0; i < c.length; i++) {
			count=0;
			if (c[i] == c2[0]) {
				for (int j = 0; j < c2.length; j++) {
					if(c[i+j]==c2[j]) {
						count++;
					}
				}
				if(count==c2.length) {
					for(int k=0;k<=c1.length;k++) {
						for(int l=c.length;l>i;l--) {
							c[l]=c[l-1];
						}
					}
					for(int m=0;m<c1.length;m++) {
						c[i+m]=c1[m];
					}
					break;
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}
