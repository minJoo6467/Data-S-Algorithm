package doIt6;

import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		if(N >=1 && N<= 100) {
			
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=i; j++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		}
	}

}
