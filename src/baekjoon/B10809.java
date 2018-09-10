package baekjoon;

import java.util.Scanner;

public class B10809 {

	//알파벳 찾기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();          //입력받을 문자열
		char[] arr = input.toCharArray();  //char변환 후, 배열에 담기
		
		
		int[] output = new int[26]; //a~z 배열
		
		for(int i=0; i< output.length; i++) { //-1로 배열 초기화
			output[i] = -1;
		}
		
		
		for(int j=0; j<arr.length; j++) { 	//arr배열 a~z검사
			int temp = arr[j]- 97;
			
			if(output[temp] == -1) {
				output[temp] = j; //입력받은 문자열의 index를 담아줌
			}
		}
		
		
		for(int i=0; i<output.length; i++) {
			System.out.print(output[i] + " "); //공백으로 구분해서 출력!!
		}
		
	}

}
