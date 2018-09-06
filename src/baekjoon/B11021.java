package baekjoon;

import java.util.Scanner;

public class B11021 {

	public static void main(String[] args) {

		//A+B-7
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("테스트 케이스 입력");
		int T = sc.nextInt();
		
		for(int i=1; i <= T; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (a+b));
			
		}
	}

}
