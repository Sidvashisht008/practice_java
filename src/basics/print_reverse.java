package basics;

import java.util.Scanner;

public class print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt(); 
		System.out.println(reverse(n));
	}
	public static int reverse(int n) {
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		while(n>0) {
			int rem=n%10;
			temp+=rem*Math.pow(10, count-1);
			count--;
			n/=10;
		}
		return temp;
	}

}
