package array;

import java.util.Scanner;

public class reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		reverse(arr);
		for(int val:arr) {
			System.out.print(val+" ");
		}

	}
	public static void reverse(int[] arr) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<hi) {
			int temp=arr[lo];
			arr[lo]=arr[hi];
			arr[hi]=temp;
			lo++;
			hi--;
		}
	}
}