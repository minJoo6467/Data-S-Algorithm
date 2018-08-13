package baekjoon;

import java.util.Scanner;

public class B2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		System.out.print("´Ü¼ö´Â? ");
		int N = scan.nextInt();
		
		if( N>=1 && N<= 100) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<= i-1; j++) {
					System.out.print(" ");
				}
				
				for(int j=i; j<=N; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
