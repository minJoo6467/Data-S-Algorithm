package baekjoon;

import java.util.Scanner;

public class B2750 {

	static void swap(int[]a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
		
	}

	static void bubbleSort(int[]a, int N) {
		
		for(int i=0; i< N-1; i++) {
			for(int j = 0; j < N-1; j++) {
				
				if(a[j] > a[j+1]) {
					swap(a, j , j+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //수의 개수
		int[] arr = new int[N];
		
		for(int i=0; i< N; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr, N);
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}
}
