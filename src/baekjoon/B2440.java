package baekjoon;

import java.util.Scanner;

public class B2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("´Ü¼ö´Â? ");
		
		int N = scan.nextInt();
	
		if(N >=1 && N<= 100) {
		
			for(int i=N; i>=1; i--) {
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
