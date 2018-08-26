package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EuclidGCD {

	//��Ŭ���� ����Լ�
	//����� : BufferedReader, BufferedWriter �̿��غ���
	static int gcd(int x, int y) {
		
		if(y ==0) {
			return x;
		}else {
			return gcd(y, x % y);
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		
		int y = Integer.parseInt(br.readLine());
			
		bw.write("�ִ������� " + gcd(x, y) + "�Դϴ�.");
		
		bw.flush();
		bw.close();
	}

}
