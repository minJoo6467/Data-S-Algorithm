package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10817 {

	//Arrays.sort
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i< arr.length; i++) {
			
			arr[i] = sc.nextInt();
		
		}
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
		
	}

}
