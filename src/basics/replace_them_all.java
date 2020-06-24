package basics;

import java.util.Scanner;

public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(replace(n));
	}
	public static int replace(int n) {
		int temp=n;
		int count=0;
		if(n==0) {
			return 5;
		}
		while(n>0) {
			int rem=n%10;
			if(rem==0) {
				temp+=5*Math.pow(10,count);
			}
			count++;
			n/=10;
		}
		return temp;
	}
}