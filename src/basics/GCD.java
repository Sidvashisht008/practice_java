package basics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println(gcd(n1, n2));

	}

	public static int gcd(int n1, int n2) {

		int min = Math.min(n1, n2);
		for (int i = min; i > 0; i--) {
			if(n1%i==0 && n2%i==0) {
				return i;
			}
		}
		return -1;
	}

}
