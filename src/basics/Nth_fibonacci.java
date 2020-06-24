package basics;

public class Nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nth(10);
	}
	public static void nth(int n) {
		int a=0;
		int b=1;
		int sum=0;
		for(int i=2;i<=n;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(b);
		
	}

}
