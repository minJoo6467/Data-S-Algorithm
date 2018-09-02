package algorithm;

import java.util.Scanner;

public class BinSearch {

	//시간 복잡도: 실행에 필요한 시간을 평가한 것.
	//요솟수가 n인 배열 a에서 key와 같은 요소 이진검색하기! 
	static int binSearch(int[]a, int n, int key) {
		
		int pl = 0;     //검색 첫번째 인덱스
		int pr = n -1;  //검색 끝 인덱스
		
		//do-while 이용
		do {
			int pc = (pl +pr)/2; //중앙 인덱스
 			if(a[pc] == key) {
 				return pc;
 				
 			}else if(a[pc] < key) {
 				pc = pc + 1;
 			}else {
 				pr = pc -1;
 			}
		}while(pl <=pr);
		
		return -1; //검색 실패일때
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //요솟수 입력 
		int[] arr = new int[n];
		
		//오름차순으로 입력
		System.out.println("arr[0]: " );
		arr[0] = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			
			do{
				System.out.println("arr[" + i + "]: " );
				arr[i] = sc.nextInt();
			}while(arr[i] < arr[i- 1 ]); //오름차순으로 입력하기 위한 조건
		}
		
		int key = sc.nextInt(); //검색할 데이터
		
		int idx = binSearch(arr, n, key);

		if(idx ==-1) {
			System.out.println("검색 실패!!!!");
		}else {
			System.out.println("arr[" + idx +"] 에 있습니다");
		}
	}
}
