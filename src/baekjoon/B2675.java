package baekjoon;

import java.util.Scanner;

public class B2675 {

	//���ڿ� �ݺ�
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt(); //�ݺ�Ƚ�� �Է�
		
		for(int i=0; i < T ; i++) {
			
			int R = scan.nextInt(); // 3
			String S = scan.next(); // ABC
			char[] output = S.toCharArray(); // �Է¹��� ���ڿ��� char�迭�� ��� 

			if(R >=1 && R <=8 && S.length() >= 1 && S.length() <=20) {
				for(int j=0;  j < output.length; j++) {
				
					for(int z=0; z < R; z++) { // R�� 3�϶� 3�� ���
						System.out.print(output[j]);
					}
				}

				System.out.println();
			}	
		}
	}
}
