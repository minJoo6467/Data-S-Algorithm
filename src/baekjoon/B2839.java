package baekjoon;

import java.util.Scanner;

public class B2839 {

	public static void main(String[] args) {
		//설탕 배달 
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int three = 0; 
		int five=0;
		int result = 0;
		
		if(N >= 3 && N<=5000) {
			
			while(N % 5 !=0 && N >0) {
				
				N -= 3;
				three ++;
			}
			
			if(N <0) {
				System.out.println(-1);
			}else {
				
				five = N /5; //5로 나누었을때 몫이 들어감!
				
				result = three + five;
				
				System.out.println("봉지의 수는? " + result);
			}
			
		}

	}

}
