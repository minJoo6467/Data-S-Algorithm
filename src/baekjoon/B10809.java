package baekjoon;

import java.util.Scanner;

public class B10809 {

	//���ĺ� ã��
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();          //�Է¹��� ���ڿ�
		char[] arr = input.toCharArray();  //char��ȯ ��, �迭�� ���
		
		
		int[] output = new int[26]; //a~z �迭
		
		for(int i=0; i< output.length; i++) { //-1�� �迭 �ʱ�ȭ
			output[i] = -1;
		}
		
		
		for(int j=0; j<arr.length; j++) { 	//arr�迭 a~z�˻�
			int temp = arr[j]- 97;
			
			if(output[temp] == -1) {
				output[temp] = j; //�Է¹��� ���ڿ��� index�� �����
			}
		}
		
		
		for(int i=0; i<output.length; i++) {
			System.out.print(output[i] + " "); //�������� �����ؼ� ���!!
		}
		
	}

}
