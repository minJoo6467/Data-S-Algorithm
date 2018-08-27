package baekjoon;

import java.util.Scanner;

public class B11719 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			
			String str = scan.nextLine();
			
			if(str.length() >=100) {
				break;
			}
			System.out.println(str);
		}
	}
}
