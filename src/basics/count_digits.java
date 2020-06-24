package basics;

import java.util.Scanner;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		System.out.println(count_value(n,d));
	}
	public static int count_value(int n,int d) {
		int cnt=0;
		while(n>0) {
			if(n%10==d) {
				cnt++;
			}
			n/=10;
		}
		return cnt;
	}
}