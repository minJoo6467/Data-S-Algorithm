package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2490 {

	public static void main(String[] args)  throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//3번의 윷놀이 start!
		for(int j=0; j <3; j++) {
			
			int count = 0; // 배(0)의 개수
			
			String[] input = br.readLine().split(" "); //ex : 0 1 0 1
			
			//배(0)의 개수 판단 후 , 증가
			for(int i=0; i < input.length; i++) {
				
				if(input[i].matches("0")) {
					count++; 	
				}
			}
		
			switch(count) {
			
				case 0:	//모두 1인경우 : 모(E)
					System.out.println("E");
					break;
				case 1:
					System.out.println("A"); //도(A)
					break;	
				case 2:
					System.out.println("B"); //개(B)
					break;
				case 3:
					System.out.println("C"); //걸(C)
					break;
				case 4:
					System.out.println("D"); //윷(D)
					break;	
			}
		}
	}
}

