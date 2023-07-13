package array;

public class Trim_String {
	public static void main(String[] args) {
		String s = "   hi hello how are you  ";
		char []c=s.toCharArray();
		String temp="";
		for(int i=0;i<c.length;i++) {
				
			if(c[i]!=' '&&c[i+1]!=' ') {
				for(int j=i;j<c.length;j++) {
				
				temp=temp+c[j];
				}
				break;
			}
			
		}
		
		char []c1=temp.toCharArray();
		String temp1="";
		for(int i=c1.length-1;i>=0;i--) {
				
			if(c1[i]!=' '&&c1[i-1]!=' ') {
				for(int j=i;j>=0;j--) {
				
				temp1=c1[j]+temp1;
				}
				break;
			}
			
		}
		System.out.println(temp1);
	
	}

}
