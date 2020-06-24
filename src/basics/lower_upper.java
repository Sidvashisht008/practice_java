package basics;

import java.util.Scanner;

public class lower_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		System.out.println(type(ch));
	}
	public static String type(char ch) {
		if(ch>='a' && ch<='z') {
			return "lowercase";
		}
		else if(ch>='A' && ch<='Z') {
			return "UPPERCASE";
		}
		else {
			return "Invalid";
		}
	}
	
	

}
