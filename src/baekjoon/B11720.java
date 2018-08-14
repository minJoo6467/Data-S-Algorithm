package baekjoon;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//숫자 개수 입력
		System.out.print("숫자 개수를 입력하세요: ");
		int N = scan.nextInt();
	
		//숫자 N개가 공백없이 주어진다.
		String input = scan.next();
	
		//합을 출력할 변수
		int sum = 0;
		
		if(N >= 1 && N<=100) {
			for(int i=0; i< N; i++) {
				sum += input.charAt(i)-'0';
			}
		}
		
		System.out.println("합은?" + sum);
		
	}

}
