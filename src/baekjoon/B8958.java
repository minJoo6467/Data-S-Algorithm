package baekjoon;

import java.util.Scanner;

public class B8958 {

	//OX Quiz
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ݺ�Ƚ�� �Է�: ");
		int num = scan.nextInt();  	
		
		int cnt = 0; //O�� ���� ����
		
		for(int i=0; i < num; i++) {
			
			String s = scan.next();
		
			char[] input = s.toCharArray(); 
			int[] sum = new int[input.length]; //sum�� ���ϱ� ���� �迭 
			
			
			for(int j=0; j < input.length; j++) {
				
				if(input[j] == 'O') {
					cnt++;
					sum[j] = cnt; 
				}else {
					cnt = 0; // X�϶���, cnt�� 0���� �ʱ�ȭ
					sum[j] = cnt;
				}
			}
			
			cnt = 0; // ȸ�� ������, �ٽ� cnt�� 0���� �ʱ�ȭ!
			
			int total = 0;
			for(int z=0; z < sum.length; z++) {
				
				total += sum[z];
			}
			
			System.out.println("����? " + total);
		}
	}
}
