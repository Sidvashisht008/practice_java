package basics;

public class decimal_to_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dec_to_oct(63));
	}
	public static int dec_to_oct(int n){
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%8;
			sum+=mul*rem;
			mul*=10;
			n/=8;
		}
		return sum;
	}
	
}
