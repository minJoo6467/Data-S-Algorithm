package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class B1181 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		//중복제거 위해서 HashSet이용!
		HashSet<String> set = new HashSet<String>();
	
		for(int i=0; i< N; i++) {
			
			set.add(scan.next());
			
		}
		
		System.out.println("set ?" +set); //중복데이터 제거 후 담아줌
		

		String[]arr = new String[set.size()];
		
		set.toArray(arr);
		
		//알파벳 순으로 정렬 ,sort
		Arrays.sort(arr); 
		
		//길이 순 정렬
		Arrays.sort(arr, (a1, a2) -> Integer.compare(a1.length(), a2.length()));
		
		for(int i=0; i< set.size(); i++) {
			System.out.println(arr[i]);
			
		}	
	}
}
