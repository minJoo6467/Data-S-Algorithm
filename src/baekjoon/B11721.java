package baekjoon;

import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //문자열 입력
		
		int len = s.length(); //문자열 길이
				
		if(s.matches("^[A-Z]*$") || s.matches("^[a-z]*$") || len <=100 || len >0) {
			//10개씩 출력
			for(int i=0; i < len ; ++i) {

				if(i % 10 == 0 && i != 0) {
					
						System.out.println();
					}	
					System.out.print(s.charAt(i));
			}
		}
	}
}
