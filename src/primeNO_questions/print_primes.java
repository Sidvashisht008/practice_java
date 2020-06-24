package primeNO_questions;

import java.util.Scanner;

public class print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		prime_range(n);
	}
	public static void prime_range(int n) {
		for(int i=2;i<n;i++) {
			int flag=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=0;
				}
			}
			if(flag==1) {
				System.out.println(i);
			}
		}
	}
}
