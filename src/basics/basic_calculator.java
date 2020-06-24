package basics;

import java.util.Scanner;

public class basic_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		while(true) {
			char ch =scn.next().charAt(0);
			
			if(ch=='+') {
				int a=scn.nextInt();
				int b=scn.nextInt();
				System.out.println(a+b);
			}
			else if(ch=='-') {
				int a=scn.nextInt();
				int b=scn.nextInt();
				System.out.println(a-b);
			}
			else if(ch=='/') {
				int a=scn.nextInt();
				int b=scn.nextInt();
				System.out.println(a/b);
			}
			else if(ch=='%') {
				int a=scn.nextInt();
				int b=scn.nextInt();
				System.out.println(a%b);
			}
			else if(ch=='*') {
				int a=scn.nextInt();
				int b=scn.nextInt();
				System.out.println(a*b);
			}
			else if(ch =='x' || ch == 'X') {
				break;
			}
			else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}
	

}
