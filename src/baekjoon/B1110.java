package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N>= 0 && N <=99) {
				
			int fresh = N; //26 
			int cycle = 0; // cycle수 출력 
	
			
			while(true) {
	
				int ten = N /10 % 10 ; // N의 십의자리 2 
				int one = N % 10; // N의 일의자리 6
				int total = (ten + one) % 10 ; //ex) 26, 2+6 =8 
				
				N = one *10 + total; // 68 
				
				cycle ++;
	
				//처음 26이랑 같아지면..
				if(fresh == N) {
					break;
				}
				
			}
			
			System.out.println("회전수는? " + cycle);
		}
	}
}
