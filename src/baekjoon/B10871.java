package baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B10871 {
	
	//X보다 작은수
	public static void main(String[] args) throws IOException{
		
		Scanner scan= new Scanner(System.in);
		
		int N = scan.nextInt(); // N = 10
		int X = scan.nextInt(); // X = 5
		int[] A = new int[N];
		
		for(int i=0; i< N; i++) {
			
			A[i] = scan.nextInt(); //1 10 4 9 2 3 8 5 7 6 입력받음

		}

		System.out.println(Arrays.toString(A));

		for(int i=0; i< A.length; i++) {
			
			if(A[i] < X) { //배열 A에 담긴 데이터 중에,  X보다 작은수를 공백으로 구분해서 출력
				System.out.print(A[i] + " ");
			}
		}
	}
}
