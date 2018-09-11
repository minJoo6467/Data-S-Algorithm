package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2908 {

	//a constant
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);

		int a = scan.nextInt(); //734
		int b = scan.nextInt(); //893


		int result1 = (a % 10) * 100 + (a/10 %10 ) * 10 + (a/100 % 10) ;
		int result2 = (b % 10) * 100 + (b/10 %10 ) * 10 + (b/100 % 10) ;
	
		System.out.println(result1 > result2 ? result1 : result2);
	}

}
