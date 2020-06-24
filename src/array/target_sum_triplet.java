package array;

import java.util.Arrays;
import java.util.Scanner;

public class target_sum_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		int target = scn.nextInt();
		target_triplet(arr, target);
	}

	public static void target_triplet(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			int lo = i + 1;
			int hi = arr.length - 1;
			while (lo < hi) {
				if (arr[i] + arr[lo] + arr[hi] == target) {
					System.out.println(arr[i] + " " + arr[lo] + " " + arr[hi]);
					lo++;
					hi--;
				} else if (arr[i] + arr[lo] + arr[hi] < target) {
					lo++;
				} else {
					hi--;
				}
			}
		}
	}

}
