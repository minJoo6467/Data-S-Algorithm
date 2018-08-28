package doIt6;

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		if(N >=1 && N <=100) {
			
			for(int i=0; i<N; i++) {
				for(int j = i+1; j<N; j++) {
					System.out.print(" ");
				}
				
				for(int k= N-i; k<=N; k++) {
					System.out.print("*");
				}
				
				System.out.println();
			}	
		}
	}

}
