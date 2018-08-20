package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B10828 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = scan.nextInt(); //명령의 수 
		scan.nextLine();
		
		for(int i=1 ; i<= N; i++) {
			
			String cmd = scan.nextLine(); //명령
			
			String[] inst = cmd.split(" ");
			
			switch(inst[0]) {
				case "push":
					stack.push(Integer.parseInt(inst[1]));
					break;
				
				case "pop":
					if(stack.isEmpty()) {
						System.out.println(-1);
					}else {
						System.out.println(stack.pop());
					}
					break;
				
				case "size":
					System.out.println(stack.size());
					break;
					
				case "empty":
					System.out.println(stack.isEmpty() ? 1 : 0);
					break;
				
				case "top":
					System.out.println(stack.isEmpty() ? -1 : stack.peek());
					break;
			}	
		}	
	}
}
