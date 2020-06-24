package basics;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N1=scn.nextInt();
		int N2=scn.nextInt();
		series(N1,N2);

	}
	public static void series(int N1,int N2) {
		int count=1;
		for(int i=1;;i++) {
			int term=3*i+2;
			if(term%N2!=0 && count<=N1) {
				System.out.println(term);
				count++;
			}
		}
	}

}
