package basics;

import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n =scn.nextLong();
		System.out.println(chew(n));
		
	}
	public static long chew(long n) {
		long temp=n;
		int count=0;
		int pos=0;
		while(temp>0) {
			pos++;
			temp/=10;
		}
		while(n>0) {
			long rem=n%10;
			if(rem>9-rem && (pos-1!=count || pos==1)) {
				temp+=(9-rem)*Math.pow(10, count);
			}
			else {
				temp+=rem*Math.pow(10, count);
			}
			count++;
			n/=10;
		}
		return temp;
	}

}
