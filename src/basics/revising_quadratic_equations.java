package basics;

import java.util.Scanner;

public class revising_quadratic_equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		roots(a, b, c);
		scn.close();
	}

	public static void roots(int a, int b, int c) {
		int d = b * b - 4 * a * c;
		if (d == 0) {
			int x = (-b + (int) Math.sqrt(d)) / 2 * a;
			System.out.println("Real and Equal");
			System.out.println(x + " " + x);
		} else if (d < 0) {
			System.out.println("Imaginary");
		} else {
			int x = (-b + (int) Math.sqrt(d)) / 2 * a;
			int y = (-b - (int) Math.sqrt(d)) / 2 * a;
			System.out.println("Real and Distinct");
			if (y > x) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
		}
	}

}
