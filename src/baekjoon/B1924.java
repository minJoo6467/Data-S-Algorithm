package baekjoon;

import java.util.Scanner;

public class B1924 {
	
	//day find
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //¿ù
		int y = sc.nextInt(); //ÀÏ
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] dayday = {"SUN" , "MON", "TUE", "WED" ,"THU", "FRI" ,"SAT"};
		
		
		int total = y; //total °è»ê
		for(int i=0;  i< x -1; i++) {
			
			total += days[i];
			
		}
		
		System.out.println("¿äÀÏÀº: " +dayday[total % 7]);
	}
}
