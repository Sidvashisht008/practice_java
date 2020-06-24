package array;

import java.util.Arrays;
import java.util.Scanner;

public class target_sum_pair {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		int target=scn.nextInt();
		target_pair(arr, target);
	}
	public static void target_pair(int[] arr,int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<hi) {
			if(arr[lo]+arr[hi]==target) {
				System.out.println(arr[lo]+" and "+arr[hi]);
				lo++;
				hi--;
			}
			else if(arr[lo]+arr[hi]<target) {
				lo++;
			}
			else {
				hi--;
			}
		}
	}
}