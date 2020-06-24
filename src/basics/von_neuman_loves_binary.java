package basics;

import java.util.Scanner;

public class von_neuman_loves_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0) {
			int n=scn.nextInt();
			System.out.println(decimal(n));
		}

	}
	public static int decimal(int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum+=mul*rem;
			mul*=2;
			n/=10;
		}
		return sum;
	}
}
