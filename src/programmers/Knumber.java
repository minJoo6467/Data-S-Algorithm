package programmers;

import java.util.Arrays;

public class Knumber {
	
	public static void main(String[] args) {
		
		int[]array = {1,5,2,6,3,7,4}; //선언배열
		
		int[][]commands = {{2,5,3},
							{4,4,1},
							{1,7,3}};

		int[] answer = new int[commands.length];
		
		int first, end, k;
		
		for(int i=0; i < commands.length; i++) { //행 길이만큼 반복
				
				first = commands[i][0];  //2
				end = commands[i][1]; //5
				k = commands[i][2]; //3
			
				int[] temp = new int[end- first +1]; 
				int cnt= 0; //temp index
				
				for(int j = first -1; j < end; j++) {
					
					temp[cnt++] = array[j];  // first부터 end까지 temp배열에 담기
				}
				
				Arrays.sort(temp); // 오름차순 정렬
				answer[i] = temp[k-1];	// k번째 수 결과배열에 담기
		}
		
		System.out.println(Arrays.toString(answer)); // 5 6 3 출력
	}
}
