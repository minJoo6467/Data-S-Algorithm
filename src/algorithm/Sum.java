package algorithm;

import java.util.Scanner;

public class Sum {

	static int sum(int x)  {
		if(x <=1) {
			return 1;
		}else {
		
			return sum(x-1) + x;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("1부터 x까지의 합을 구합니다.");
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		System.out.println("1부터 " + x +"까지의 합은 "+ sum(x));
	}

}
