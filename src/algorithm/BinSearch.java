package algorithm;

import java.util.Scanner;

public class BinSearch {

	//�ð� ���⵵: ���࿡ �ʿ��� �ð��� ���� ��.
	//��ڼ��� n�� �迭 a���� key�� ���� ��� �����˻��ϱ�!
	static int binSearch(int[]a, int n, int key) {
		
		int pl = 0;     //�˻� ù��° �ε���
		int pr = n -1;  //�˻� �� �ε���
		
		//do-while �̿�
		do {
			int pc = (pl +pr)/2; //�߾� �ε���
 			if(a[pc] == key) {
 				return pc;
 				
 			}else if(a[pc] < key) {
 				pc = pc + 1;
 			}else {
 				pr = pc -1;
 			}
		}while(pl <=pr);
		
		return -1; //�˻� �����϶�
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //��ڼ� �Է�
		int[] arr = new int[n];
		
		//������������ �Է�
		System.out.println("arr[0]: " );
		arr[0] = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			
			do{
				System.out.println("arr[" + i + "]: " );
				arr[i] = sc.nextInt();
			}while(arr[i] < arr[i- 1 ]); //������������ �Է��ϱ� ���� ����
		}
		
		int key = sc.nextInt(); //�˻��� ������
		
		int idx = binSearch(arr, n, key);

		if(idx ==-1) {
			System.out.println("�˻� ����!!!!");
		}else {
			System.out.println("arr[" + idx +"] �� �ֽ��ϴ�");
		}
	}
}
