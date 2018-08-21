package baekjoon;

import java.util.Scanner;

public class B10845 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //����� �� 
		scan.nextLine();
		
		Queue que = new Queue(100000);

		if(1<= N  || N <= 10000) {
			for(int i= 0; i< N; i++) {
			
			String str = scan.nextLine();
			String[] queue = str.split(" ");
			
			switch(queue[0]) {
				case "push":
					que.push(Integer.parseInt(queue[1]));
					break;
				
				case "pop" :
					System.out.println(que.pop());
					break;
					
				case "size":
					System.out.println(que.size());
					break;
					
				case "empty":
					System.out.println(que.empty());
					break;
				
				case "front":
					System.out.println(que.front());
					break;
				
				case "back" : 
					System.out.println(que.back());
					break;
		
				}			
			}
			scan.close();
		}
	}
	static class Queue {

		private int front; 
		private int back;
		private int num;
		private int max;
		private int[]que;
		
		public Queue(int max) {
			front = back = num =0;
		
			try {
				que = new int[max];
			}catch(OutOfMemoryError e) {
				max = 0;
			}
		}
		
		public void push(int x) {
			
			if(x >= 1 && x <=100000 ) {
				que[back++] = x;
				num ++;
			}
			if(back == max) {
				back =0;
			}
		}
		
		public int pop() {
			
			if(num <=0) {
				return -1; //������ ������ -1 ���
			}
			
			int x = que[front++];
			num --;
			
			if(front == max) {
				front = 0;
			}
			return x;
		}
		
		public int front() {
			if(num <=0) {
				return -1; //�� ���ڸ��� ������ -1 ����
				
			}
			return que[front];
		}
		
		public int back() {
			if(num <= 0) {
				return -1; //�� �ڰ� ������ -1 ����
			}else {
				return que[back-1];
			}
		}
		public int size() {
			return num;
		}
		
		public int empty() {
			
			return (num <=0 ? 1 : 0);
			
        }
	}
}
