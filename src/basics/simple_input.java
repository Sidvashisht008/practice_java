package basics;

import java.util.Scanner;

public class simple_input {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int a = scn.nextInt();
			sum += a;
			if (sum < 0) {
				break;
			} else {
				System.out.println(a);
			}

		}

	}
}