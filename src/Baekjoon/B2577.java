package Baekjoon;

import java.util.Scanner;

public class B2577 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			int total = A * B * C;
			
			String convert = Integer.toString(total);
			
			char[] arr = convert.toCharArray();
			
			int[] num = new int[10]; //index�� ������ ������ ���� 0~9�� �ش�
			
			for(int i=0; i< arr.length; i++) {
				
				num[arr[i] - '0'] ++;
			}
			
			//���ڿ� �ش��ϴ� ���� ���
			
			for(int a : num) {
				System.out.println(a);
			}
	
		}
}


