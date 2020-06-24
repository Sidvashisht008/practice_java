package basics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println(lcm(n1, n2));
	}
	public static int lcm(int n1,int n2) {
		int max=Math.max(n1,n2);
		for(int i=max;;i++) {
			if(i%n1==0 && i%n2==0) {
				return i;
			}
		}
	}
}