package array;

import java.util.Scanner;

public class odd_even_back_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N=scn.nextInt();
		allowed(N);
		
	}
	public static void allowed(int N) {
		int sume=0;
		int sumo=0;
		while(N>0) {
			int rem=N%10;
			if(rem%2==0) {
				sume+=rem;
			}
			else {
				sumo+=rem;
			}
			N/=10;
		}
		if(sume%4==0 || sumo%3==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
