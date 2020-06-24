package array;

import java.util.Scanner;

public class next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			nxt_grt(arr);
		}
	}

	public static void nxt_grt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					System.out.println(arr[i] + "," + arr[j]);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(arr[i] + "," + "-1");
			}
		}
	}

}
