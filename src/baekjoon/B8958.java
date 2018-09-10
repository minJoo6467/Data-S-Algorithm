package baekjoon;

import java.util.Scanner;

public class B8958 {

	//OX Quiz
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반복횟수 입력: ");
		int num = scan.nextInt();  	
		
		int cnt = 0; //O의 개수 세기
		
		for(int i=0; i < num; i++) {
			
			String s = scan.next();
		
			char[] input = s.toCharArray(); 
			int[] sum = new int[input.length]; //sum을 구하기 위한 배열 
			
			
			for(int j=0; j < input.length; j++) {
				
				if(input[j] == 'O') {
					cnt++;
					sum[j] = cnt; 
				}else {
					cnt = 0; // X일때는, cnt를 0으로 초기화
					sum[j] = cnt;
				}
			}
			
			cnt = 0; // 회전 끝나면, 다시 cnt를 0으로 초기화!
			
			int total = 0;
			for(int z=0; z < sum.length; z++) {
				
				total += sum[z];
			}
			
			System.out.println("합은? " + total);
		}
	}
}
