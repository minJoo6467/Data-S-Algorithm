package algorithm;

import java.util.Scanner;

public class DayOfYear {

	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//윤년
			
	};
	
	//서기 year년은 윤년인가?(윤년:1/ 평년:0)
	static int isLeap(int year) {
		
		return (year % 4 ==0 && year % 100 != 0 || year % 400 == 0 ) ? 1 : 0 ;
	}
	
	
	//그 해 남은 일 수 구하기
	static int leftDayOfYear(int y, int m, int d) {
		
		int days = d;
		
		for(int i=1; i < m; i++ ) { //1월부터 (m-1)월까지
			
			days += mdays[isLeap(y)][i -1];
			
		}
		return 365 + isLeap(y) - days;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("그 해 남은 일수를 구합니다!!");
		
		
		System.out.print("년: "); int year = scan.nextInt();
		System.out.print("월: "); int month = scan.nextInt();
		System.out.print("일: "); int day = scan.nextInt();
			
		System.out.printf("그 해 남은 일수는 %d일입니다.\n" ,leftDayOfYear(year, month, day));
	}

}
