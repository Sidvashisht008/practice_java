package interesting_questions;

import java.util.Scanner;

public class inverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(inverse(n));
	}
	public static int inverse(int n) {
		int pos=1;
		int ans=0;
		while(n>0) {
			int rem=n%10;
			ans+=pos*Math.pow(10,rem-1);
			pos++;
			n/=10;
		}
		return ans;
		
	}
}