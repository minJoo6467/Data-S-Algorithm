package baekjoon;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//���� ���� �Է�
		System.out.print("���� ������ �Է��ϼ���: ");
		int N = scan.nextInt();
	
		//���� N���� ������� �־�����.
		String input = scan.next();
	
		//���� ����� ����
		int sum = 0;
		
		if(N >= 1 && N<=100) {
			for(int i=0; i< N; i++) {
				sum += input.charAt(i)-'0';
			}
		}
		
		System.out.println("����?" + sum);
		
	}

}
