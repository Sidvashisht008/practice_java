package primeNO_questions;

import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(check(1));
	}
	public static boolean check(int n) {
		if(n<=2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	

}
