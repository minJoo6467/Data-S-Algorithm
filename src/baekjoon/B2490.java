package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2490 {

	public static void main(String[] args)  throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//3���� ������ start!
		for(int j=0; j <3; j++) {
			
			int count = 0; // ��(0)�� ����
			
			String[] input = br.readLine().split(" "); //ex : 0 1 0 1
			
			//��(0)�� ���� �Ǵ� �� , ����
			for(int i=0; i < input.length; i++) {
				
				if(input[i].matches("0")) {
					count++; 	
				}
			}
		
			switch(count) {
			
				case 0:	//��� 1�ΰ�� : ��(E)
					System.out.println("E");
					break;
				case 1:
					System.out.println("A"); //��(A)
					break;	
				case 2:
					System.out.println("B"); //��(B)
					break;
				case 3:
					System.out.println("C"); //��(C)
					break;
				case 4:
					System.out.println("D"); //��(D)
					break;	
			}
		}
	}
}

