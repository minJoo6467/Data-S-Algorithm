package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2558 {

	//A + B -2
	public static void main(String[] args) throws IOException{
		
		//Scanner에 비해 실행시간 단축 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A+B);
	}

}
