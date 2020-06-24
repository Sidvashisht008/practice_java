package array;

import java.util.Scanner;

public class max_value_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(max(arr));
	}
	public static int max(int[] arr) {
		int max_value=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max_value) {
				max_value=arr[i];
			}
		}
		return max_value;
	}

}
