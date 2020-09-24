package array;

import java.util.Scanner;

public class calculate_the_sum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			sum+=arr[i];
		}
		int t=scn.nextInt();
		System.out.println((int)Math.pow(2, t)*sum);
	}
}
