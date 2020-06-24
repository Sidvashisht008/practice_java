package array;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int find=scn.nextInt();
		System.out.println(l_search(arr,find));

	}
	public static int l_search(int[] arr,int find) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				return i;
			}
		}
		return -1;
	}
}
