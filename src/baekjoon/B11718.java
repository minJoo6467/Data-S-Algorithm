package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B11718 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			
			if(str== null ||str.isEmpty() || str.length() >=100 || str.startsWith(" ") || str.endsWith(" ")) {
				break;
			}

			System.out.println(str);
		}
	}
}
