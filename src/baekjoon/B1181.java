package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class B1181 {
	
	static void swap(String[]a , int idx1, int idx2) {
		String temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		//�ߺ����� ���ؼ� HashSet�̿�!
		HashSet<String> set = new HashSet<String>();
	
		for(int i=0; i< N; i++) {
			
			set.add(scan.next());
			
		}
		
		System.out.println("set ?" +set); //�ߺ������� ���� �� �����
		

		String[]arr = new String[set.size()];
		
		set.toArray(arr);
		
		//���ĺ� ������ ����
		Arrays.sort(arr); 
		
		//���� �� ����
		Arrays.sort(arr, (a1, a2) -> Integer.compare(a1.length(), a2.length()));
		
		for(int i=0; i< set.size(); i++) {
			System.out.println(arr[i]);
			
		}	
	}
}
