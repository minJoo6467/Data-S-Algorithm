package baekjoon;

import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next(); //���ڿ� �Է�
		
		int len = s.length(); //���ڿ� ����
				
		if(s.matches("^[A-Z]*$") || s.matches("^[a-z]*$") || len <=100 || len >0) {
			//10���� ���
			for(int i=0; i < len ; ++i) {

				if(i % 10 == 0 && i != 0) {
					
						System.out.println();
					}	
					System.out.print(s.charAt(i));
			}
		}
	}
}
