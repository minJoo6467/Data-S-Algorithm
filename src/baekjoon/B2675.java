package baekjoon;

import java.util.Scanner;

public class B2675 {

	//문자열 반복
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt(); //반복횟수 입력
		
		for(int i=0; i < T ; i++) {
			
			int R = scan.nextInt(); // 3
			String S = scan.next(); // ABC
			char[] output = S.toCharArray(); // 입력받은 문자열을 char배열에 담기 

			if(R >=1 && R <=8 && S.length() >= 1 && S.length() <=20) {
				for(int j=0;  j < output.length; j++) {
				
					for(int z=0; z < R; z++) { // R이 3일때 3번 출력
						System.out.print(output[j]);
					}
				}

				System.out.println();
			}	
		}
	}
}
