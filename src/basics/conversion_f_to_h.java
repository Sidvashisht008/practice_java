package basics;

import java.util.Scanner;

public class conversion_f_to_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int min_f=scn.nextInt();
		int max_f=scn.nextInt();
		int tab_jump=scn.nextInt();
		for(int i=min_f;i<=max_f;i+=tab_jump) {
			int celsius= convert(i);
			System.out.println(i+" "+celsius);
		}
	}
	public static int convert(int fah) {
		int cel=5*(fah-32)/9;
		return cel;
	}

}
