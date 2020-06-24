package array;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int find=scn.nextInt();
		System.out.println(b_search(arr,find));
	}
	public static int b_search(int[] arr, int find) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==find) {
				return mid;
			}
			else if(arr[mid]>find) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}

}
